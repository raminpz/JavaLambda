package test;

import dao.Data;
import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream04_sorted {

    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();
        // Orden descendente
        stream
                .sorted((t1, t2) -> Double.compare(t2.getPrecio(), t1.getPrecio()))
                .forEach(t ->
                        System.out.printf("%-35s S/%1.2f\n",
                                t.getTitulo(),t.getPrecio()));
    }
}
