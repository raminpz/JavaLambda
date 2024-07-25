package test;

import dao.Data;
import dto.Tutoriales;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream03_map {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        List<String> list = stream
                .map(Tutoriales::getTitulo) // no terminal(retorna stream)
                .toList();// terminal

        list.forEach(System.out::println);
    }
}
