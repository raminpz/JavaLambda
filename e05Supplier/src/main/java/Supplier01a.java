import java.util.function.Supplier;

public class Supplier01a {

    public static void main(String[] args) {

        // Proveedor
        Supplier<Long> tiempo = () -> {

            Long t = System.currentTimeMillis();
            return t;
        };

        // Aplicacion
        System.out.println(tiempo.get());
    }
}
