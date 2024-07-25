import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Atomic04 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ramiro", "Cristian", "Santiago", "Emily", "Javier", "Cristina");

        AtomicInteger index = new AtomicInteger(0);


        AtomicReference<String> msg = new AtomicReference<>("Mis alumnos: ");
        list.forEach(a ->{
            msg.set(msg.get() + a + (index.addAndGet(1) < list.size() ? ", " : "."));
        });
        System.out.println(msg.get());
    }
}
