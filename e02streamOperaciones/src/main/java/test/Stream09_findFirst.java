package test;

import dao.Data;
import dto.Tutoriales;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream09_findFirst {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        Optional<Tutoriales> optional = stream
                .filter(t -> t.getPrecio() >= 15.0)
                .filter(t -> t.getVendidos() > 9)
                .findFirst(); // findFirst retorna Optional<Tutoriales>, de toda la ligica solo el primero
        Tutoriales t = optional.get();
        System.out.printf("%-35s S/%1.2f (vendidos: %d)\n",
                t.getTitulo(),
                t.getPrecio(),
                t.getVendidos());


    }
}
