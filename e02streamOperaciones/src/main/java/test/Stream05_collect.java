package test;

import dao.Data;
import dto.Tutoriales;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream05_collect {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        // convierte stream a list
        List<Tutoriales> list = stream
                .collect(Collectors.toList());

        list.forEach(t ->
                System.out.printf("%2d %-35s%-5s S/%1.2f\n",
                        t.getIdTutirial(),
                        t.getTitulo(),
                        t.getTipo(),
                        t.getPrecio()));




    }
}
