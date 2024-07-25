package test;

import java.util.Arrays;
import java.util.List;


public class Stream06_distinct {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,5,2,3,6,7,1,2,8,5);

        // Deja de lado los siguientes repetidos
        List<Integer> sinRepetir = list.stream()
                .distinct()
                .toList();

        System.out.println(Arrays.toString(sinRepetir.toArray()));
    }
}
