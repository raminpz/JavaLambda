package test;

import java.util.Arrays;
import java.util.List;


public class Stream08_anyMatch {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 5, 6, 8);

        System.out.println(Arrays.toString(list.toArray()));

        // Evaluar si hay algua coincidencia (buscar impar)
        boolean hayImpar = list.stream()
                .anyMatch(x -> x % 2 == 0);
        System.out.println("Hay algun impar? "+(hayImpar ? "Si" : "No"));

    }
}
