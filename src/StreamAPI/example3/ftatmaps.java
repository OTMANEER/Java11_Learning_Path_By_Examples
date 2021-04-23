package StreamAPI.example3;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ftatmaps {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1,31831),
                List.of(9,173),
                List.of(90,73),List.of(1,31831),
                List.of(9,173),
                List.of(90,73),List.of(1,31831),
                List.of(9,173),
                List.of(90,73),List.of(1,31831),
                List.of(9,173),
                List.of(90,73),List.of(1,31831),
                List.of(9,173),
                List.of(90,73),List.of(1,31831),
                List.of(9,173),
                List.of(90,73)
        );
         list.stream()
                .flatMap(Collection::stream) // stream continuation
                .distinct()
                 .sorted()
                .forEach(System.out::println);
   String digists = "0123456789";
    List<String> list2 = List.of("otmane91821");
    long c = list2.stream()
            .flatMap(s-> Arrays.stream(s.split("")))
            .filter(s->digists.contains(s))
            .count();
    }
}
