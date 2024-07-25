package test;

import dao.Data;
import dto.Tutoriales;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream07_collect {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        Optional<Double> total = stream
                .map(t -> t.getPrecio() * t.getVendidos())
                        .reduce(Double::sum);
        System.out.printf("Total ingreso: S/%1.2f\n", total.orElse(0.0));
    }
}
