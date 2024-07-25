package test;

import dao.Data;
import dto.Tutoriales;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream05_max {

    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        // Hallar maximo vendidos
        Optional<Tutoriales> optional = stream
                .max((t1, t2) -> Integer.compare(t1.getVendidos(), t2.getVendidos()));

        Tutoriales t = optional.get();
        System.out.println("El maximo vendido es: " + t.getTitulo() + " con " + t.getVendidos() + " ventas");
    }
}
