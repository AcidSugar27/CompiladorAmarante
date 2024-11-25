import java.util.HashMap;
import java.util.Map;


public class SymbolTable {
    private Map<String, String> symbols = new HashMap<>();

    // Agrega una variable con su tipo
    public void addVariable(String name, String type) {
        symbols.put(name, type);
    }

    // Verifica si la variable está definida
    public boolean isVariableDefined(String name) {
        return symbols.containsKey(name);
    }

    // Obtiene el tipo de la variable
    public String getVariableType(String name) {
        return symbols.get(name);
    }
    public String mostrarTablaDeSimbolos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tabla de símbolos:\n");

        // Verifica si la tabla está vacía
        if (symbols.isEmpty()) {
            sb.append("La tabla de símbolos está vacía.\n");
        } else {
            // Recorre cada símbolo en la tabla y lo agrega al StringBuilder
            for (Map.Entry<String, String> entry : symbols.entrySet()) {
                sb.append("Variable: ").append(entry.getKey())
                        .append(" - Tipo: ").append(entry.getValue()).append("\n");
            }
        }
        return sb.toString();  // Devuelve la tabla de símbolos como un String
    }

}

