package test;

import dao.Data;
import dto.Tutoriales;

import java.util.List;
import java.util.stream.Stream;

public class Stream11_peek {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        List<Tutoriales> list = stream
                //imprime antes del aumento
                .peek(t -> System.out.printf("%-35s S/%1.2f\n",
                        t.getTitulo(),
                        t.getPrecio()))
                // aumentamos 20%
                .peek(t -> t.setPrecio(t.getPrecio() * 1.2))
                .toList();
        System.out.println();
        list.forEach(t -> System.out.printf("%-35s S/%1.2f\n", t.getTitulo(), t.getPrecio()));
    }

}
