package e01c_aplica;

import e01b_implementa.Baldor;

import java.util.Arrays;
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


        // Imprime los valores random
        System.out.println(Arrays.toString(vs));

        // Predicados
        Predicate<Double> predNega = x -> x < 0;
        Predicate<Double> predPosi = x -> x > 0;

        // Operaciones
        Double sumaNehativos = Baldor.suma(predNega, (Object[]) vs);
        Double sumaPositivos = Baldor.suma(predPosi, (Object[]) vs);
        Double maximoNegativo = Baldor.maximo(predNega, (Object[]) vs);
        Double minimoNegativo = Baldor.minimo(predNega, (Object[]) vs);
        Double maximoPositivo = Baldor.maximo(predPosi, (Object[]) vs);
        Double minimoPositivo = Baldor.minimo(predPosi, (Object[]) vs);
        Double promedioPositivos = Baldor.promedio(predPosi, (Object[]) vs);

        System.out.println("\nsuma de los negativos: " + sumaNehativos);
        System.out.println("\nsuma de los positivos: " + sumaPositivos);
        System.out.println("\nmaximo valor negativos: " + maximoNegativo);
        System.out.println("\nminimo valor negativos: " + minimoNegativo);
        System.out.println("\nmaximo valor positivo: " + maximoPositivo);
        System.out.println("\nminimo valor positivo: " + minimoPositivo);
        System.out.println("promedio de valores mayores que CERO: " + promedioPositivos);
    }
}
