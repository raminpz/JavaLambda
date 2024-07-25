package e02c_aplica;

import e01b_implementa.Baldor;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 *  Se tiene un grupo de 42 alumnos. Cada uno tiene una nota final en el curso de Java.
 *  Se desea saber lo siguiente:
    + Cuántos jalaron [0,10]
    + Cuántos son regulares [11, 15]
    + Cuántos son buenos [16, 18]
    + Cuántos son muy buenos [19, 20]
 */
public class Main {
    public static void main(String[] args) {

        // Genere 42 valores aleatorios entre [0, 20]
        Random random = new Random();
        Integer[] vs = IntStream.of(random.ints(42, 0,20).toArray())
                .boxed()
                .toArray(Integer[]::new);


        // Imprime los valores random
        System.out.println(Arrays.toString(vs));

        // Jalados [0, 10]
        Predicate<Double> predJala = x -> x >= 0 && x <= 10;

        // Regulares [11, 15]
        Predicate<Double> predRegu= x -> x >= 11 && x <= 15;

        // Buenos [16, 18]
        Predicate<Double> predBuen= x -> x >= 16 && x <= 18;

        // Muy buenos [19, 20]
        Predicate<Double> predMuyb= x -> x >= 19 && x <= 20;

        // Reportes:
        System.out.println("\njalados: "+ Baldor.cuantos(predJala, vs).intValue());
        System.out.println("\nregulares: "+ Baldor.cuantos(predRegu, vs).intValue());
        System.out.println("\nbuenos: "+ Baldor.cuantos(predBuen, vs).intValue());
        System.out.println("\nMuy buenos: "+ Baldor.cuantos(predMuyb, vs).intValue());



    }

}
