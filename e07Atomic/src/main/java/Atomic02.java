import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic02 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6, 5, -3, 8, 5, -16);

        AtomicBoolean flag = new AtomicBoolean();

        list.forEach(x -> {
            flag.set(x >= 0);
            System.out.println(x + (flag.get() ? " is positive" : " is negative"));
        });
    }
}
