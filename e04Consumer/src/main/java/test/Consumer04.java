package test;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Consumer04 {

    public static void main(String[] args) {

        // Consumidor
        Consumer<Map<String, Object>> triangulo = t -> {

            Integer numfils = (Integer) t.get("numfils");
            String car = (String) t.get("car");
            StringBuilder result = (StringBuilder) t.get("figura");

            // Maneje las filas
            for (int fil = 1; fil <numfils ; fil++) {

                // espacios en blanco al inicio de cada fila
                result.append(" ".repeat((numfils - fil)));

                // maneja las columnas
                result.append(String.valueOf(car).repeat(fil));

                result.append(String.valueOf(car).repeat(fil - 1));

                result.append("\n");
            }

            t.put("figura", result);
        };

        // Applicacion
        Map<String, Object> data = new HashMap<>();
        data.put("numfils", 8);
        data.put("car", "*");
        data.put("figura", new StringBuilder());

        triangulo.accept(data);
        System.out.println(data.get("figura"));

    }
}
