package StreamAPI.sortedComparable;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class example1 {
    public static void main(String[] args) {
        List<Character> ratings = Arrays.asList('U', 'R', 'A');
       ratings.stream()
                .filter(x->x=='A')  //1
           .peek(x->System.out.println("Old Rating "+x)) //2
            .map(x->x=='A'?'R':x) //3
          .peek(x->System.out.println("New Rating "+x))
               .forEach(System.out::println);

    }
}
