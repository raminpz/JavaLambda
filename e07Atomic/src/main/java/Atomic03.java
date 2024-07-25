import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Atomic03 {
    public static void main(String[] args) {

        List<Double> list = Arrays.asList(1.9d, 2.4d, 3.1d, 4.7d, 5.3d, 6.0d);

        AtomicReference<Double> sum = new AtomicReference<>(0d);
        list.forEach(x ->{
            sum.set(sum.get() + x);
        });
        System.out.println("Suma: "+ sum.get());
        System.out.println("Promedio: "+ sum.get()/list.size());
    }
}
