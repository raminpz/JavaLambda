package test;

import java.util.Base64;
import java.util.function.Function;

public class Function02 {

    public static void main(String[] args) {

        // Función que codifica
        Function<String,String> codifica = data -> {

            byte[] v = Base64.getEncoder().encode(data.getBytes());

            return  new String(v);
        };

        // Función que decodifica
        Function<String,String> decodifica = data -> {

            byte[] v = Base64.getDecoder().decode(data);

            return  new String(v);
        };

        // Aplicaciones
        System.out.println(codifica.apply("Ramiro Nuñez")); // UmFtaXJvIE51w7Fleg==
        System.out.println(decodifica.apply("UmFtaXJvIE51w7Fleg=="));


    }
}
