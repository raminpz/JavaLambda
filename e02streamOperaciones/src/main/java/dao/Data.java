package dao;

import dto.Tutoriales;

import java.util.stream.Stream;

public class Data {

    public static Stream<Tutoriales> stream() {
        Stream<Tutoriales> stream = Stream.of(
                new Tutoriales(1, "Programacion Funcional", "Video", 10.0, 0),
                new Tutoriales(2, "Programacion Orientada a Objetos", "PDF", 15.9, 10),
                new Tutoriales(3, "Programacion Web", "Video", 29.0, 5),
                new Tutoriales(4, "Angular 11", "Video", 40.0, 23),
                new Tutoriales(5, "Spring Boot con Thymeleaft", "Video", 50.0, 0),
                new Tutoriales(6, "Python", "PDF", 55.9, 12)
        );
        return stream;
    }
}
