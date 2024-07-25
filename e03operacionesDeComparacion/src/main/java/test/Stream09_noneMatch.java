package test;

import java.util.Arrays;
import java.util.List;


public class Stream09_noneMatch {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 5, 7, 8);

        System.out.println(Arrays.toString(list.toArray()));

        // Evaluar ninguna coincidencia (buscar multiplo de 3)
        boolean hayMultiploDe3 = list.stream()
                .noneMatch(x -> x % 3 == 0);
        // Sale No, porque si lo hay
        System.out.println("No existe multiplo de 3? "+(hayMultiploDe3 ? "No existe" : "Si existe"));

    }
}
