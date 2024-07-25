package test;


import dao.Data;
import dto.Tutoriales;

import java.util.List;
import java.util.stream.Stream;

public class Stream15_reduce {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        Integer ctosVendidos = stream
                .map(Tutoriales::getVendidos)
                .reduce(0, Integer::sum);
        System.out.println("Cantidad de tutoriales vendidos: " + ctosVendidos);
    }
}
