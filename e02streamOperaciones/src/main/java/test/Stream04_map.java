package test;

import dao.Data;
import dto.Tutoriales;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream04_map {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        List<Object[]> list = stream
                .map(tutorial -> {
                    return new Object[]{
                            tutorial.getTitulo(),
                            tutorial.getPrecio()

                    };
                })
                .collect(Collectors.toList());

        list.forEach(f -> System.out.printf("%-35s S/%-1.2f\n", f[0], f[1]));
    }
}
