import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Arbolparser {

    public static String analyzeTree(String input) {
        // Crear lexer a partir de la entrada
        AmaranteLexer lexer = new AmaranteLexer(CharStreams.fromString(input));

        // Crear token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el parser a partir del token stream
        AmaranteParser parser = new AmaranteParser(tokens);

        // Establecer la regla de inicio de tu gramática (por ejemplo, "programa")
        ParseTree tree = parser.programa(); // "programa" es la regla de inicio en la gramática

        // Obtener el árbol en una cadena jerárquica
        return getTreeAsString(tree, 0); // Recursivamente obtiene el árbol como cadena con indentación
    }


    private static String getTreeAsString(ParseTree tree, int indentLevel) {
        StringBuilder builder = new StringBuilder();

        // Añadir indentación basada en el nivel de profundidad
        for (int i = 0; i < indentLevel; i++) {
            builder.append("  "); // 2 espacios de indentación por nivel
        }

        // Añadir el texto del nodo
        builder.append(tree.getText()).append("\n");

        // Llamada recursiva para los hijos
        for (int i = 0; i < tree.getChildCount(); i++) {
            builder.append(getTreeAsString(tree.getChild(i), indentLevel + 1)); // Incrementamos el nivel de indentación
        }

        return builder.toString();
    }
}

