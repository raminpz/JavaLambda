package test;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class Consumer02 {

    public static void main(String[] args) {

        // Consumidor
        Consumer<String> tiempo = ciudad -> {

            // tiempo en milisegundos (único en el planeta)
            long time_long = System.currentTimeMillis();

            // formato para la interpretacion del triempo
            DateTimeFormatter dtf =
                    DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            // interpretacion del tiempo segun la ciudad
            LocalDateTime ldt_ciudad = LocalDateTime
                    .ofInstant(Instant.ofEpochMilli(time_long), ZoneId.of(ciudad));

            // imprimiendo
            String str = ldt_ciudad.format(dtf);
            System.out.println(str);
        };

        // Applicacion
        System.out.println("Tiempo en Lima: ");
        tiempo.accept("America/Lima");

        System.out.println("\nTiempo en Ucrania/Kiev: ");
        tiempo.accept("Europe/Kiev");


        System.out.println("\nTiempo en Madrid: ");
        tiempo.accept("Europe/Madrid");


    }
}
