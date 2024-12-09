import java.util.HashMap;
import java.util.Map;


public class SymbolTable {
    // Mapa para almacenar el tipo de las variables
    private Map<String, String> types = new HashMap<>();
    // Mapa para almacenar el valor de las variables
    private Map<String, Object> values = new HashMap<>();

    // Agrega una variable con su tipo y valor
    public void addVariable(String name, String type, Object value) {
        types.put(name, type);
        values.put(name, value);  // Almacena el valor junto con el tipo
    }

    // Verifica si la variable está definida
    public boolean isVariableDefined(String name) {
        return types.containsKey(name) && values.containsKey(name);
    }

    // Obtiene el tipo de la variable
    public String getVariableType(String name) {
        return types.get(name);
    }

    // Obtiene el valor de la variable
    public Object getVariableValue(String name) {
        return values.get(name);
    }

    // Muestra la tabla de símbolos con tipos y valores
    public String mostrarTablaDeSimbolos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tabla de símbolos:\n");

        // Verifica si la tabla está vacía
        if (types.isEmpty()) {
            sb.append("La tabla de símbolos está vacía.\n");
        } else {
            // Recorre cada símbolo en la tabla y lo agrega al StringBuilder
            for (Map.Entry<String, String> entry : types.entrySet()) {
                String name = entry.getKey();
                String type = entry.getValue();
                Object value = values.get(name);  // Obtiene el valor asociado a la variable

                sb.append("Variable: ").append(name)
                        .append(" - Tipo: ").append(type)
                        .append(" - Valor: ").append(value != null ? value : "no definido")
                        .append("\n");
            }
        }
        return sb.toString();  // Devuelve la tabla de símbolos como un String
    }
}




