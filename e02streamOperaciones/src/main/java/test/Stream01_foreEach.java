package test;

import dao.Data;
import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream01_foreEach {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();
        stream.forEach(t ->
                System.out.printf("%2d %-35s%-5s S/%1.2f (vendidos: %d)\n",
                t.getIdTutirial(),
                t.getTitulo(),
                t.getTipo(),
                t.getPrecio(),t.getVendidos()));
    }
}
