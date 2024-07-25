package test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer03 {

    public static void main(String[] args) {

        // Consumidor
        Consumer<List<String>> reverse = list -> {

            for (int i = 0; i < list.size(); i++) {
                StringBuilder sb = new StringBuilder(list.get(i));
                list.set(i, sb.reverse().toString());
            }
        };

        // Applicacion
        List<String> nombres = new ArrayList<>();
        nombres.add("Ramiro");
        nombres.add("Emily");
        nombres.add("Carolina");
        nombres.add("Linda");
        nombres.add("Juan");

        System.out.println("Lista de nombres antes de ser consumidos: ");
        nombres.forEach(n -> System.out.println(n));
        System.out.println();

        System.out.println("Lista enviada al consumidos: ");
        reverse.accept(nombres);
        nombres.forEach(n -> System.out.println(n));

    }
}
