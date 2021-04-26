package StreamAPI;

import java.util.List;

public class example4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,129,21,3,5,11);
        list.stream()
                .takeWhile(n->n<20)
                .forEach(System.out::println);
    }
}
