import org.antlr.v4.runtime.*;

import java.util.List;

public class Analizadorlexico {
    public static String analyzeLexical(String input) {
        // Crear lexer a partir de la entrada
        AmaranteLexer lexer = new AmaranteLexer(CharStreams.fromString(input));

        // Crear token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Generar los tokens
        lexer.reset();
        StringBuilder result = new StringBuilder();
        List<? extends Token> tokenList = lexer.getAllTokens();
        for (Token token : tokenList) {
            result.append("Token: ").append(lexer.getVocabulary().getSymbolicName(token.getType()))
                    .append(" | Texto: '").append(token.getText()).append("'\n");
        }
        return result.toString();
    }
}

