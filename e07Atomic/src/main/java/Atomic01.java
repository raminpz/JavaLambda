import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic01 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        AtomicInteger sum = new AtomicInteger(0);
        list.forEach(sum::addAndGet);
        System.out.println("Suma: "+ sum.intValue());
    }
}
