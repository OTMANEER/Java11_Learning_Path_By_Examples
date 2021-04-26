package StreamAPI.peeketc;

import java.util.List;

public class pee {
    public static void main(String[] args) {
        List<Integer> list=List.of(12,21,11,99,28,53);
        list.stream()
                .peek(System.out::println)
                .forEach(System.out::println);
    }
}
