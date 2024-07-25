package test;

import dto.Tutoriales;

import java.util.stream.Stream;

public class Stream01_of {

    public static void main(String[] args) {

        Stream<Tutoriales> stream = Stream.of(
                new Tutoriales(1, 0, 100.0, "Video", "Java 8 Programacion Funcional"),
                new Tutoriales(2, 20, 200.0, "pdf", "Angular 18"),
                new Tutoriales(3, 30, 300.0, "Video", "Spring Boot")
        );

        stream.forEach(t -> System.out.printf("%2d  %-25s %-25s S/%.2f\n", t.getIdTutirial(), t.getTitulo(),t.getTipo(), t.getPrecio()));

    }
}
