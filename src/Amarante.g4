grammar Amarante;

options {
    language = Java;
}

// Lexer rules
SPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;

Comillas: '"';
T_dato: 'byte' | 'char' | 'long' | 'float' | 'double' | 'int' | 'String';
Cadena: '"' .*? '"';
If: 'if';
Else: 'else';
Do: 'do';
While: 'while';
For: 'for';
Igual: '=';
Suma: '+';
Resta: '-';
Multiplicacion: '*';
Division: '/';
Op_logico: '&&' | '||' | '!' | '&' | '|';
Op_relacional: '>' | '<' | '==' | '!=' | '>=' | '<=' | '<<' | '>>';
Op_atribucion: '+=' | '-=' | '*=' | '/=' | '%=';
Op_incremento: '++' | '--';
Op_booleano: 'true' | 'false';
Parentesis_a: '(';
Parentesis_c: ')';
Llave_a: '{';
Llave_c: '}';
Corchete_a: '[';
Corchete_c: ']';
Main: 'main';
P_coma: ';';
PRINT: 'print';

Identificador: [a-zA-Z_][a-zA-Z_0-9]*;
Numero: '-'? [0-9]+;

// Error handling
ERROR: .;

// Parser rules
programa:  Main Parentesis_a Parentesis_c Llave_a sentencias Llave_c;

sentencias: sentencia*;

sentencia: declaracion
         | if_stmt
         | if_else_stmt
         | while_stmt
         | do_while_stmt
         | for_stmt
         | expr_stmt
         | print_stmt;

print_stmt: PRINT Parentesis_a expr_boleana Parentesis_c P_coma
          | PRINT Parentesis_a Cadena Parentesis_c P_coma
          | PRINT Parentesis_a Identificador Parentesis_c P_coma;


declaracion: (T_dato Identificador P_coma)
           | (T_dato Identificador Igual Numero P_coma)
           | (T_dato Identificador Igual Cadena P_coma);

if_stmt: If Parentesis_a expr_boleana Parentesis_c Llave_a sentencias Llave_c;

if_else_stmt: If Parentesis_a expr_boleana Parentesis_c Llave_a sentencias Llave_c Else Llave_a sentencias Llave_c;

while_stmt: While Parentesis_a expr_boleana Parentesis_c Llave_a sentencias Llave_c;

do_while_stmt: Do Llave_a sentencias Llave_c While Parentesis_a expr_boleana Parentesis_c P_coma;

for_stmt: For Parentesis_a expr_for Parentesis_c Llave_a sentencias Llave_c;

expr_for: (T_dato Identificador Igual Numero P_coma expr_boleana P_coma declaracion_for)
        | (Identificador Igual Numero P_coma expr_boleana P_coma declaracion_for);

declaracion_for: (Identificador Op_atribucion Numero)
               | (Identificador Op_incremento)
               | (Op_incremento Identificador);

expr_boleana: Identificador Op_relacional Numero
            | Op_booleano;


expr_stmt: Identificador Op_atribucion Numero P_coma
         | Identificador Op_atribucion Cadena P_coma;




