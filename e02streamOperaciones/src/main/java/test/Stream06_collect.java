package test;

import dao.Data;
import dto.Tutoriales;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream06_collect {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        String str = stream
                .map(t -> String.format("%-35s S/%1.2f", t.getTitulo(), t.getPrecio()))
                .collect(Collectors.joining("\n"));
        System.out.println(str);
    }
}
