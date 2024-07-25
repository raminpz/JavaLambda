package test;

import dao.Data;
import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream12_count {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();
        long ctos = stream
                .filter(t -> t.getPrecio() >= 40.0)
                .filter(t -> t.getVendidos() > 20)
                .count(); // Para contabilizar cuantas datos cumplen con el anterior criterio
        System.out.println("Cantidad de tutoriales (>S/40 y > 20 vendidos): " + ctos);

    }
}
