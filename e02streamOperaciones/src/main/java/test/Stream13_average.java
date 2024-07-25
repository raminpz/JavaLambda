package test;

import dao.Data;
import dto.Tutoriales;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream13_average {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        OptionalDouble promPrecios = stream
                .mapToDouble(Tutoriales::getPrecio)
                .average();

        System.out.printf("Promedio de precios: S/%1.2f\n", promPrecios.getAsDouble());

    }
}
