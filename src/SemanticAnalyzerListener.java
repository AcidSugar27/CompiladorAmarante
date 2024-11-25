import java.util.HashSet;
import java.util.Set;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import javax.swing.*;

public class SemanticAnalyzerListener extends AmaranteBaseListener {
    private final SymbolTable symbolTable = new SymbolTable();
    private JTextArea outputArea;

    public SemanticAnalyzerListener(JTextArea outputArea) {
        this.outputArea = outputArea;
    }

    @Override
    public void enterDeclaracion(AmaranteParser.DeclaracionContext ctx) {
        if (ctx == null) {
            outputArea.append("Error: La declaración es nula.\n");
            return;
        }

        // Verifica si el tipo de dato está presente
        String variableType = ctx.T_dato() != null ? ctx.T_dato().getText() : null;

        // Verifica si el identificador está presente
        if (ctx.Identificador() == null) {
            outputArea.append("Error: La declaración de la variable es incompleta. Falta asignar la variable de forma correcta.\n");
            return;
        }

        // Si Identificador no es null, extrae su texto
        String variableName = ctx.Identificador().getText();

        if (variableType == null) {
            outputArea.append("Error: Falta el tipo de dato para la variable '" + variableName + "'.\n");
            return;
        }

        // Verifica si el nombre de la variable es válido
        if (!isValidVariableName(variableName)) {
            outputArea.append("Error: El nombre de la variable '" + variableName + "' es inválido.\n");
            return;
        }

        // Verifica si la variable ya ha sido declarada
        if (symbolTable.isVariableDefined(variableName)) {
            outputArea.append("Error: La variable '" + variableName + "' ya ha sido declarada.\n");
        } else {
            symbolTable.addVariable(variableName, variableType);
            outputArea.append("Variable '" + variableName + "' de tipo '" + variableType + "' declarada correctamente.\n");
        }
    }

    @Override
    public void enterSentencia(AmaranteParser.SentenciaContext ctx) {
        // Verifica si es una declaración de variable
        if (ctx.declaracion() != null) {
            String variableName = ctx.declaracion().Identificador() != null
                    ? ctx.declaracion().Identificador().getText()
                    : null;

            // Verifica si la variable está definida en la tabla de símbolos
            if (variableName == null || !symbolTable.isVariableDefined(variableName)) {
                outputArea.append("Error: La variable '" + (variableName != null ? variableName : "desconocida") + "' no se ha definido de forma correcta.\n");
            } else {
                // Obtiene y muestra el tipo de la variable
                String variableType = symbolTable.getVariableType(variableName);
                outputArea.append("Uso de la variable '" + variableName + "' de tipo '" + variableType + "'.\n");
            }
        }
        // Verifica otros tipos de bloques, como if, while, etc.
        else if (ctx.if_stmt() != null) {
            outputArea.append("Procesando bloque if.\n");
        } else if (ctx.if_else_stmt() != null) {
            outputArea.append("Procesando bloque if-else.\n");
        } else if (ctx.while_stmt() != null) {
            outputArea.append("Procesando bloque while.\n");
        } else if (ctx.do_while_stmt() != null) {
            outputArea.append("Procesando bloque do-while.\n");
        } else if (ctx.for_stmt() != null) {
            outputArea.append("Procesando bloque for.\n");
        }
    }

    private boolean isValidVariableName(String name) {
        return name.matches("[a-zA-Z_][a-zA-Z0-9_]*"); // Comienza con letra o _ y seguido de letras, números o _
    }

    @Override
    public void enterPrograma(AmaranteParser.ProgramaContext ctx) {
        // Verificamos si el contexto del programa no es nulo
        if (ctx == null) {
            outputArea.append("Error: El contexto del programa es nulo.\n");
            return;
        }

        // Verificamos la presencia del token Main
        if (ctx.Main() == null) {
            outputArea.append("Error: La función 'Main' no está definida en el programa.\n");
        } else {
            outputArea.append("La función 'Main' está definida en el programa.\n");

            // Verificamos los paréntesis de apertura y cierre
            if (ctx.Parentesis_a() == null || ctx.Parentesis_c() == null) {
                outputArea.append("Error: Falta uno o ambos paréntesis en la definición de 'Main'.\n");
            } else {
                outputArea.append("Paréntesis de 'Main' verificados correctamente.\n");

                // Verificamos las llaves de apertura y cierre
                if (ctx.Llave_a() == null || ctx.Llave_c() == null) {
                    outputArea.append("Error: Falta una o ambas llaves en la definición de 'Main'.\n");
                } else {
                    outputArea.append("Llaves de 'Main' verificadas correctamente.\n");
                    // Aquí podrías procesar las sentencias dentro del bloque de 'Main'
                }
            }
        }
    }
}







/*
    @Override
    public void enterFuncion(AmaranteParser.FuncionContext ctx) {
        if (ctx == null) {
            System.err.println("Error: El contexto de la función es nulo.");
            return;
        }

        String functionName = ctx.Identificador().getText();
        if (!"main".equals(functionName)) {
            System.err.println("Error: Se esperaba la función 'main', pero se encontró: '" + functionName + "'.");
            return;
        }

        // Verificación de estructura completa para `main () { sentencias }`
        if (ctx.Parentesis_a() == null || ctx.Parentesis_c() == null ||
                ctx.Llave_a() == null || ctx.Llave_c() == null || ctx.sentencias() == null) {
            System.err.println("Error: La función 'main' no sigue la estructura 'main () { ... }'.");
            return;
        }

        // Verifica que 'sentencias' contenga al menos una sentencia
        if (ctx.sentencias().sentencia().isEmpty()) {
            System.err.println("Error: El bloque de 'main' debe contener al menos una sentencia.");
        } else {
            System.out.println("La función 'main' está estructurada correctamente y contiene sentencias.");
        }
    }
*//*
    @Override
    public void enterExpresion(AmaranteParser.ExpresionContext ctx) {
        // Verificación de una operación de asignación (Identificador = Expresión)
        if (ctx.Identificador() != null && ctx.Op_atribucion() != null) {
            String variableName = ctx.Identificador().getText();

            // Verifica si la variable está definida en la tabla de símbolos
            if (!symbolTable.isVariableDefined(variableName)) {
                System.err.println("Error: La variable '" + variableName + "' no está definida.");
            } else {
                System.out.println("Asignación a la variable '" + variableName + "'.");
            }
        }

        // Verificación de incremento o decremento
        if (ctx.Op_incremento() != null || ctx.Op_decremento() != null) {
            String operator = ctx.Op_incremento() != null ? "++" : "--";
            System.out.println("Operación de incremento/decremento detectada: " + operator);
        }

        // Verificación de operaciones aritméticas o lógicas
        if (ctx.Suma() != null || ctx.Resta() != null || ctx.Multiplicacion() != null || ctx.Division() != null) {
            System.out.println("Operación aritmética detectada.");
        }

        if (ctx.Op_logico() != null) {
            System.out.println("Operación lógica detectada.");
        }

        if (ctx.Op_relacional() != null) {
            System.out.println("Operación relacional detectada.");
        }

        // Verificación de expresiones numéricas o booleanas
        if (ctx.Numero() != null) {
            System.out.println("Número detectado: " + ctx.Numero().getText());
        }
        if (ctx.Op_booleano() != null) {
            System.out.println("Valor booleano detectado: " + ctx.Op_booleano().getText());
        }
    }

*/



    // Aquí puedes agregar más métodos para validar otros aspectos de tu gramática y el uso de las variables,
    // como el chequeo de tipos en operaciones aritméticas, asignaciones, etc.





