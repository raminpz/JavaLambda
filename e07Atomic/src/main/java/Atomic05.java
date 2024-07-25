import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Atomic05 {
    public static void main(String[] args) {

        List<Object[]> list = Arrays.asList(
                new Object[]{"Ramiro", 37},
                new Object[]{"Cristian", 19},
                new Object[]{"Santiago", 10},
                new Object[]{"Emily", 20},
                new Object[]{"Javier", 36},
                new Object[]{"Cristina", 25}
        );

        AtomicReference<Object[]> msg = new AtomicReference<>();
        AtomicReference<List<Object[]>> listmsg = new AtomicReference<>(new ArrayList<>());

        list.forEach(fil ->{
            msg.set(new Object[]{fil[0] + " tiene ", fil[1] + " años"});
            listmsg.get().add(msg.get());
        });

        listmsg.get().forEach(m -> System.out.printf("%s%s\n",m[0].toString(), m[1].toString()));
    }
}
