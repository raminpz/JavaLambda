import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reference04 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(100, 20, 3, 4, 50, 6, 77, 8, 9, 10);
        list.stream()
                .sorted(Integer::compareTo)
                .forEach(System.out::println);


    }
}
