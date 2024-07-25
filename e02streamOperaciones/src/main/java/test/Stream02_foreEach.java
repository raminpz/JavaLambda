package test;

import dao.Data;
import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream02_foreEach {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();
        stream.forEach(t -> {
            t.setPrecio(t.getPrecio() * 1.2); // Incrementando precio 20%

            System.out.printf("%2d %-35s%-5s S/%1.2f\n",
                    t.getIdTutirial(), t.getTitulo(), t.getTipo(), t.getPrecio());
        });
    }
}
