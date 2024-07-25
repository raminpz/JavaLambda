package test;


import java.util.List;
import java.util.stream.Stream;

public class Stream14_skip_limit {
    public static void main(String[] args) {

        // 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ..., infinito
        Stream<Integer> stream = Stream.iterate(2, i -> i * 2);

        List<Integer> list = stream
                .skip(3) // Salta los 3 primeros
                .limit(5)// Coge los 5 siguientes
                .toList();  // Operacion terminal

        list.forEach(System.out::println);
    }
}
