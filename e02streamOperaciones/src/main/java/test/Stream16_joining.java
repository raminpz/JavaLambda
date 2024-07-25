package test;


import dao.Data;
import dto.Tutoriales;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream16_joining {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        String tuto = stream
                .map(Tutoriales::getTitulo)
                .collect(Collectors.joining(", "));

        System.out.println(tuto);
    }
}
