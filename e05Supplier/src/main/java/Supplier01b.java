import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Supplier01b {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("tiempo_format", "America/Lima");
        map.put("tiempo_result", null);

        // LLamo al proveedor
        map.put("tiempo_long", tiempo_long.get());

        // Llmando al consumidor
        tiempo_format.accept(map);

        // Aplicacion
        System.out.println("Tiempo en Lima: " +map.get("tiempo_result"));
    }

    // Proveedor
    private static Supplier<Long> tiempo_long = () -> {
        Long t = System.currentTimeMillis();
        return t;
    };

    // Consumidor
    private static Consumer<Map<String, Object>> tiempo_format = tiempo -> {

        // tiempo en milisegundos (único en el planeta)
        long time_long = (long) tiempo.get("tiempo_long");

        // formato para la interpretacion del triempo
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // interpretacion del tiempo segun la ciudad
        LocalDateTime ldt_ciudad = LocalDateTime
                .ofInstant(Instant.ofEpochMilli(time_long), ZoneId.of(tiempo.get("tiempo_format").toString()));

        // imprimiendo
        String str = ldt_ciudad.format(dtf);
        tiempo.put("tiempo_result", str);
    };
}
