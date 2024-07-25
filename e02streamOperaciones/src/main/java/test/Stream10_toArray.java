package test;

import dao.Data;
import dto.Tutoriales;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream10_toArray {
    public static void main(String[] args) {

        Stream<Tutoriales> stream = Data.stream();

        Tutoriales[] array = stream.toArray(Tutoriales[]::new);// generame el arreglo y lo guardas en el array

        for (Tutoriales t : array) {
            System.out.printf("%-35s S/%1.2f (vendidos: %d)\n",
                    t.getTitulo(),
                    t.getPrecio(),
                    t.getVendidos());
        }


    }
}
