
public class CodeGenerationVisitor extends AmaranteBaseVisitor<String> {
    private final SymbolTable symbolTable = new SymbolTable();

    @Override
    public String visitPrograma(AmaranteParser.ProgramaContext ctx) {
        StringBuilder code = new StringBuilder();

        // Verifica si hay una función main
        code.append("function main() {\n");
        if (ctx.sentencias() != null) {
            code.append(visit(ctx.sentencias()));  // Visita las sentencias dentro de Main
        }
        code.append("\n}");
        return code.toString();
    }

    @Override
    public String visitSentencias(AmaranteParser.SentenciasContext ctx) {
        StringBuilder code = new StringBuilder();
        for (AmaranteParser.SentenciaContext sentenciaCtx : ctx.sentencia()) {
            String sentencia = visit(sentenciaCtx);  // Procesa cada sentencia
            if (!sentencia.isEmpty()) {
                code.append(sentencia).append("\n");
            }
        }
        return code.toString();
    }

    @Override
    public String visitSentencia(AmaranteParser.SentenciaContext ctx) {
        if (ctx.declaracion() != null) {
            return visit(ctx.declaracion());
        } else if (ctx.if_stmt() != null) {
            return visit(ctx.if_stmt());
        } else if (ctx.if_else_stmt() != null) {
            return visit(ctx.if_else_stmt());
        } else if (ctx.while_stmt() != null) {
            return visit(ctx.while_stmt());
        } else if (ctx.do_while_stmt() != null) {
            return visit(ctx.do_while_stmt());
        } else if (ctx.for_stmt() != null) {
            return visit(ctx.for_stmt());
        } else if (ctx.print_stmt() != null) {
            return visit(ctx.print_stmt());
        }

        else {
            // Aquí podrías manejar otros tipos de sentencias
            return "";
        }
    }

    @Override
    public String visitDeclaracion(AmaranteParser.DeclaracionContext ctx) {
        String tipo = ctx.T_dato() != null ? ctx.T_dato().getText() : "let";  // Tipo de dato (ej. int, byte, o let por defecto)
        String nombre = ctx.Identificador().getText();  // Nombre de la variable

        // Usamos "let" para los String
        if (tipo.equals("String")) {
            tipo = "let";  // Convertimos String a let
        }

        if (ctx.Igual() != null) {
            if (ctx.expr_aritmetica() != null) {
                String valor = visit(ctx.expr_aritmetica());
                symbolTable.addVariable(nombre, tipo, valor);
                return tipo + " " + nombre + " = " + valor + ";";
            }
            // Si hay asignación
            else if (ctx.Numero() != null) {  // Asignación de número
                int valor = Integer.parseInt(ctx.Numero().getText());
                symbolTable.addVariable(nombre, tipo, valor);
                return tipo + " " + nombre + " = " + valor + ";";
            } else if (ctx.Cadena() != null) {  // Asignación de cadena
                String valor = ctx.Cadena().getText();
                valor = valor.substring(1, valor.length() - 1);
                symbolTable.addVariable(nombre, tipo, valor); // Eliminar comillas
                return tipo + " " + nombre + " = \"" + valor + "\";";
            }
        } else {
            return tipo + " " + nombre + ";";  // Declaración sin asignación
        }
        return "";  // Si no se cumple ninguna de las condiciones, no retorna nada
    }

    @Override
    public String visitIf_stmt(AmaranteParser.If_stmtContext ctx) {
        // Obtener la condición del if
        String condicion = visit(ctx.expr_boleana());

        // Obtener las sentencias dentro del bloque if
        String sentenciasIf = visit(ctx.sentencias());

        // Generar el código para el bloque if
        return "if (" + condicion + ") {\n" + sentenciasIf + "\n}";
    }

    @Override
    public String visitIf_else_stmt(AmaranteParser.If_else_stmtContext ctx) {
        // Obtener la condición del if
        String condicion = visit(ctx.expr_boleana());

        // Obtener las sentencias dentro del bloque if y else
        String sentenciasIf = visit(ctx.sentencias(0));  // Primer bloque (if)
        String sentenciasElse = visit(ctx.sentencias(1)); // Segundo bloque (else)

        // Generar el código para el bloque if-else
        return "if (" + condicion + ") {\n" + sentenciasIf + "\n} else {\n" + sentenciasElse + "\n}";
    }

    @Override
    public String visitWhile_stmt(AmaranteParser.While_stmtContext ctx) {
        String condicion = visit(ctx.expr_boleana());
        String sentencias = visit(ctx.sentencias());
        return "while (" + condicion + ") {\n" + sentencias + "\n}";
    }

    @Override
    public String visitDo_while_stmt(AmaranteParser.Do_while_stmtContext ctx) {
        String sentencias = visit(ctx.sentencias());
        String condicion = visit(ctx.expr_boleana());
        return "do {\n" + sentencias + "\n} while (" + condicion + ");";
    }

    @Override
    public String visitFor_stmt(AmaranteParser.For_stmtContext ctx) {
        String exprFor = visit(ctx.expr_for());
        String sentencias = visit(ctx.sentencias());
        return "for (" + exprFor + ") {\n" + sentencias + "\n}";
    }

    @Override
    public String visitExpr_for(AmaranteParser.Expr_forContext ctx) {
        String inicializacion;
        if (ctx.T_dato() != null) {
            String tipo = ctx.T_dato().getText();
            String variable = ctx.Identificador().getText();
            String valor = ctx.Numero().getText();
            inicializacion = tipo + " " + variable + " = " + valor;
        } else {
            String variable = ctx.Identificador().getText();
            String valor = ctx.Numero().getText();
            inicializacion = variable + " = " + valor;
        }

        String condicion = visit(ctx.expr_boleana());
        String actualizacion = visit(ctx.declaracion_for());
        return inicializacion + "; " + condicion + "; " + actualizacion;
    }

    @Override
    public String visitDeclaracion_for(AmaranteParser.Declaracion_forContext ctx) {
        if (ctx.Op_atribucion() != null) {
            String variable = ctx.Identificador().getText();
            String valor = ctx.Numero().getText();
            return variable + " " + ctx.Op_atribucion().getText() + " " + valor;
        } else if (ctx.Op_incremento() != null) {
            return ctx.Identificador().getText() + ctx.Op_incremento().getText();
        }
        return "";
    }

    @Override
    public String visitExpr_boleana(AmaranteParser.Expr_boleanaContext ctx) {
        if (ctx.Identificador() != null && ctx.Op_relacional() != null && ctx.Numero() != null) {
            String variable = ctx.Identificador().getText();
            String operador = ctx.Op_relacional().getText();
            String numero = ctx.Numero().getText();
            return variable + " " + operador + " " + numero;
        } else if (ctx.Op_booleano() != null) {
            return ctx.Op_booleano().getText();
        }
        return "";
    }
    @Override
    public String visitExpr_stmt(AmaranteParser.Expr_stmtContext ctx) {
        String nombre = ctx.Identificador().getText();
        String valor = ctx.Numero().getText();
        return nombre + " = " + valor + ";";
    }




    @Override
    public String visitPrint_stmt(AmaranteParser.Print_stmtContext ctx) {
        // Verifica si el 'print' es una cadena
        if (ctx.Cadena() != null) {
            String valor = ctx.Cadena().getText();
            valor = valor.substring(1, valor.length() - 1);  // Elimina las comillas
            System.out.println("Generando código para imprimir cadena: " + valor);  // Depuración
            return "console.log(\"" + valor + "\");";  // Genera console.log con la cadena
        }
        // Si el 'print' es una variable (Identificador)
        else if (ctx.Identificador() != null) {
            System.out.println("Generando código para imprimir variable: " + ctx.Identificador().getText());  // Depuración
            return "console.log(" + ctx.Identificador().getText() + ");";  // Genera console.log con el nombre de la variable
        }
        else if (ctx.expr_aritmetica() != null) {
            String expr = visit(ctx.expr_aritmetica());  // Obtiene la expresión aritmética dentro de print
            System.out.println("Generando código para imprimir expresión aritmética: " + expr);  // Depuración
            return "console.log(" + expr + ");";  // Genera console.log con la expresión aritmética
        }

        // Si el 'print' es una expresión booleana
        else {
            String expr = visit(ctx.expr_boleana());  // Obtiene la expresión dentro de print
            System.out.println("Generando código para imprimir expresión booleana: " + expr);  // Depuración
            return "console.log(" + expr + ");";  // Genera console.log con la expresión
        }
    }


    @Override
    public String visitExpr_aritmetica(AmaranteParser.Expr_aritmeticaContext ctx) {
        // Si la operación es una suma
        if (ctx.Suma() != null) {
            String left = visit(ctx.expr_aritmetica());  // Lado izquierdo de la suma
            String right = visit(ctx.expr_aritmetica_b());  // Lado derecho de la suma
            // Evaluamos si son variables y calculamos el resultado
            return evaluateExpression(left, right, "+");
        }
        // Si la operación es una resta
        else if (ctx.Resta() != null) {
            String left = visit(ctx.expr_aritmetica());
            String right = visit(ctx.expr_aritmetica_b());
            return evaluateExpression(left, right, "-");
        }
        return "";
    }

    @Override
    public String visitExpr_aritmetica_b(AmaranteParser.Expr_aritmetica_bContext ctx) {
        // `expr_aritmetica_b` maneja multiplicación y división
        if (ctx.Multiplicacion() != null) { // Si la operación es una multiplicación
            String left = visit(ctx.expr_aritmetica_b());  // Lado izquierdo
            String right = visit(ctx.expr_aritmetica_c());  // Lado derecho
            return left + " * " + right;
        } else if (ctx.Division() != null) { // Si la operación es una división
            String left = visit(ctx.expr_aritmetica_b());
            String right = visit(ctx.expr_aritmetica_c());
            return left + " / " + right;
        } else {
            // Si no hay multiplicación o división, delegamos a `expr_aritmetica_c`
            return visit(ctx.expr_aritmetica_c());
        }
    }

    public String visitExpr_aritmetica_c(AmaranteParser.Expr_aritmetica_cContext ctx) {
        // `expr_aritmetica_c` maneja operandos y expresiones entre paréntesis
        if (ctx.Numero() != null) {  // Si es un número
            return ctx.Numero().getText();  // Retornamos el número como está
        } else if (ctx.Identificador() != null) {  // Si es un identificador (variable)
            return ctx.Identificador().getText();  // Retornamos el nombre de la variable
        } else if (ctx.Parentesis_a() != null) {  // Si es una expresión entre paréntesis
            return "(" + visit(ctx.expr_aritmetica()) + ")";  // Evaluamos la expresión dentro
        }
        return "";  // Caso por defecto
    }
    private String evaluateExpression(String left, String right, String operator) {
        // Verifica si las expresiones son variables y obtiene sus valores de la tabla de símbolos
        if (isVariable(left) && isVariable(right)) {
            String leftValue = getVariableValue(left);
            String rightValue = getVariableValue(right);
            return leftValue + " " + operator + " " + rightValue;
        } else if (isVariable(left)) {
            String leftValue = getVariableValue(left);
            return leftValue + " " + operator + " " + right;
        } else if (isVariable(right)) {
            String rightValue = getVariableValue(right);
            return left + " " + operator + " " + rightValue;
        }
        return " " + left + " " + operator + " " + right;  // Si no son variables, realizamos la operación directamente
    }

    // Verifica si el valor es una variable
    private boolean isVariable(String value) {
        return symbolTable.isVariableDefined(value);
    }

    private String getVariableValue(String variable) {
        Object value = symbolTable.getVariableValue(variable);
        if (value != null) {
            return value.toString();
        }
        return "undefined";  // Retorna "undefined" si la variable no está definida
    }





}


