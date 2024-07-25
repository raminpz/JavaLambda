package test;

import dao.Data;
import dto.Tutoriales;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream05_min {

    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        // Hallar minimo vendidos
        Optional<Tutoriales> optional = stream
                .min((t1, t2) -> Integer.compare(t1.getVendidos(), t2.getVendidos()));

        Tutoriales t = optional.get();
        System.out.println("El menos vendido es: " + t.getTitulo() + " con " + t.getVendidos() + " ventas");
    }
}
