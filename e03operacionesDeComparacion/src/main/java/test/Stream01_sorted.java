package test;

import dao.Data;
import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream01_sorted {

    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();
        // Orden ascendente
        stream
                .sorted((t1, t2) -> t1.getTitulo().compareTo(t2.getTitulo()))
                .forEach(t ->
                        System.out.printf("%-35s S/%1.2f\n",
                                t.getTitulo(),t.getPrecio()));
    }
}
