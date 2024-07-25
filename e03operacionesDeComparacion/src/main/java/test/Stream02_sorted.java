package test;

import dao.Data;
import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream02_sorted {

    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();
        // Orden descendente
        stream
                .sorted((t1, t2) -> t2.getTitulo().compareTo(t1.getTitulo()))
                .forEach(t ->
                        System.out.printf("%-35s S/%1.2f\n",
                                t.getTitulo(),t.getPrecio()));
    }
}
