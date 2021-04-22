package StreamAPI.example2;

import java.util.List;

public class StreamApi2 {
    public static void main(String[] args) {
        List<String> list = List.of("10","201","jeaea","OTMANE");

        System.out.println(list.stream()
                .map(String::length)
                .reduce(0, Integer::sum));
        // reduce  is a terminal operator,
        System.out.println(list.stream()
                .mapToInt(s -> s.length())
                .sum());


    }
}
