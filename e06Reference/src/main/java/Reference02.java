import java.util.ArrayList;
import java.util.List;

public class Reference02 {
    public static void main(String[] args) {

        Reference02 reference02 = new Reference02();
        Mensaje mensaje = reference02::frase;

        System.out.println(mensaje.dice());
        
    }

    private String frase(){
        return "Lambda es lo máximo";
    }

    interface Mensaje{
        public String dice();
    }
}
