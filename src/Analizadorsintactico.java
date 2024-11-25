import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Analizadorsintactico {

    public static String analyzeSyntax(String input) {
        // Crear lexer a partir de la entrada
        AmaranteLexer lexer = new AmaranteLexer(CharStreams.fromString(input));

        // Crear token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el parser a partir del token stream
        AmaranteParser parser = new AmaranteParser(tokens);

        // Añadir un ErrorListener para capturar los errores de sintaxis
        MyErrorListener errorListener = new MyErrorListener();
        parser.removeErrorListeners();  // Remover el listener por defecto
        parser.addErrorListener(errorListener);  // Agregar nuestro listener personalizado

        // Intentar analizar la entrada sintácticamente
        try {
            // Llamamos a la regla principal, en este caso "programa"
            ParseTree tree = parser.programa(); // "programa" es la regla de inicio en la gramática

            // Si no hubo errores, retornamos un mensaje de éxito y el árbol de análisis
            if (errorListener.hasErrors()) {
                return errorListener.getErrorMessages();  // Mostrar los errores detectados
            }

            // Si el análisis es exitoso, retornamos un mensaje de éxito y el árbol de análisis
            return "Análisis sintáctico correcto\nÁrbol de análisis: ";

        } catch (RecognitionException e) {
            // En caso de error de sintaxis, devolvemos el mensaje de error
            return "Error en la estructura sintáctica: " + e.getMessage();
        }
    }
}







