import java.util.ArrayList;
import java.util.List;

public class Reference01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ramiro");
        list.add("Emily");
        list.add("Dayana");
        list.add("Carol");
        list.add("Diana");

        list.forEach(System.out::println);
    }
}
