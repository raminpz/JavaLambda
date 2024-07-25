import java.util.ArrayList;
import java.util.List;

public class Reference03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ramiro");
        list.add("Emily");
        list.add("Dayana");
        list.add("Carol");
        list.add("Diana");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
