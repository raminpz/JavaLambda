package org.e00;

import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // Genere 20 valores aleatorios entre [-9, 9]
        Random random = new Random();
        Integer[] vs = IntStream.of(random.ints(20, -9,9).toArray())
                .boxed()
                .toArray(Integer[]::new);

        // Predicados
        Predicate<Integer> negativo = x -> x < 0;
        Predicate<Integer> positivo = x -> x > 0;

        for (Integer v: vs) {
            System.out.printf("%3d %s\n ", v,
                    negativo.test(v) ? " es negativo"
                    : positivo.test(v) ? " es positivo"
                    : " ES CERO");
        }

    }
}