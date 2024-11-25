import org.antlr.v4.runtime.*;

public class MyErrorListener extends BaseErrorListener {

    private StringBuilder errorMessages = new StringBuilder();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        // Guardamos los errores de sintaxis en un StringBuilder
        errorMessages.append("Error de sintaxis en la línea " + line + ":" + charPositionInLine + " - " + msg + "\n");
    }

    // Método para verificar si hubo errores
    public boolean hasErrors() {
        return errorMessages.length() > 0;
    }

    // Método para obtener todos los mensajes de error
    public String getErrorMessages() {
        return errorMessages.toString();
    }
}

