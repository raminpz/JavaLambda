package test;



import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream17_summarizing {
    public static void main(String[] args) {

        Stream<Double> stream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        DoubleSummaryStatistics stats = stream
                .collect(Collectors.summarizingDouble(Double::doubleValue));
        System.out.println("cantidad: " + stats.getCount());
        System.out.println("suma: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
    }
}
