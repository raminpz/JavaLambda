package e03c_aplica;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Números pares:");
        imprime(list, n -> n % 2 == 0);

        System.out.println("Números impares:");
        imprime(list, n -> n % 2 == 1);

        System.out.println("Números mayores que 5:");
        imprime(list, n -> n > 5);

    }

    public static void imprime(List<Integer> list, Predicate<Integer> predicate){

        list.forEach(n -> {
            if (predicate.test(n)){
                System.out.print(n +" ");
            }
        });
        System.out.println("\n");
    }
}
