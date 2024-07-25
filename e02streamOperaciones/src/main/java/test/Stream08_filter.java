package test;

import dao.Data;
import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream08_filter {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();
        stream
                .filter(t -> t.getPrecio() >= 40.0)
                .filter(t -> t.getVendidos() > 20)
                .forEach(t ->
                        System.out.printf("%-35s S/%1.2f (vendidos: %d)\n",
                                t.getTitulo(),
                                t.getPrecio(),
                                t.getVendidos()));

    }
}
