package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class Consumer01 {

    public static void main(String[] args) {

        // Consumidor
        Consumer<String> tiempo = f -> {

            LocalDateTime ldt = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(f);
            System.out.println(dtf.format(ldt));
        };

        // Applicacion
        tiempo.accept("dd/MM/uuuu");
        System.out.println();
        tiempo.accept("hh:mm:ss a");
        System.out.println();
        tiempo.accept("HH:mm:ss");
        System.out.println();
        tiempo.accept("dd/MM/uuuu HH:mm");

    }
}
