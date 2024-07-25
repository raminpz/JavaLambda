package test;

import java.util.function.Function;

public class Function01 {

    public static void main(String[] args) {

        // Funcion que recibe una cadena y retorna cantidad de vocales que tiene que hay en ella

        Function<String, Integer> vocales = v -> {

            int ctas_vocales = 0;

            for (int i = 0; i < v.length(); i++) {
                switch (v.toLowerCase().charAt(i)) {
                    case 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú' -> ++ctas_vocales;
                }
            }

            return ctas_vocales;
        };

        String frase = "Viva el Perú carajo...!";
        System.out.println("Cantidad de vocales en \"" + frase + "\": " + vocales.apply(frase));
    }
}
