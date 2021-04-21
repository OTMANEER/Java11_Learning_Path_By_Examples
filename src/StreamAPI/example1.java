package StreamAPI;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,31,12,101,200);
        list.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
    public Stream<Integer> m(){
        return Stream.empty();
    }
    public List<Integer> mm(){
        return Collections.emptyList();
    }
}
