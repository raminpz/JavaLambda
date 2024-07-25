package test;

import java.util.Arrays;
import java.util.List;


public class Stream07_allMatch {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 5, 6, 8);

        System.out.println(Arrays.toString(list.toArray()));

        // Evaluar si todos coinciden con valores pares
        boolean todosPares = list.stream()
                .allMatch(x -> x % 2 == 0);
        System.out.println("Todos son pares: "+(todosPares ? "Si" : "No"));

    }
}
