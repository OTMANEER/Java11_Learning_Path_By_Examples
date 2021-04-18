package Functions;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {
        // Consumer and BiConsumer
/*
        List<Integer> list = List.of(33,22,100,1);
        Consumer<Integer> consumer = System.out::println;*/
        Map<String,Integer> map =Map.of(
                "OTMANE", 1998,
                "Saleh",84191,
                "Farid",2000
        );
        BiConsumer<String,Integer> biConsumer = (s,ss)-> System.out.println(s+" ->"+ss);
        map.forEach(biConsumer);
    }
}