package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function03 {

    public static void main(String[] args) {

        // Función que recibe frase y retorna las palabras en ella.
        Function<String, List<String>> palabras = frase -> {

            // Quitando caracteres que no son letras
            frase = frase.replaceAll("[.,;!¡¿?0-9]*","");

            String[] p = frase.split(" ");

            return Arrays.asList(p);
        };

        // Aplicacion
        String frase = "La memoria, es la inteligencia de los tontos.";
        List<String> list = palabras.apply(frase);
        list.forEach(System.out::println);

    }
}
