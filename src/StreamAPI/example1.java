package StreamAPI;

import java.net.Inet4Address;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class example1 {
    public static void main(String[] args) {
/*        List<Integer> list = List.of(1,2,31,12,101,200);
        list.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
        System.out.println("------");
        Stream<Integer> s = Stream.of(1,33,129,1001,120,21,77,298);
            s.forEach(System.out::println);
        */
        System.out.println("--------");
        Supplier<Integer> supplier = ()->new Random().nextInt();
           // Stream<Integer> s1 = Stream.generate(supplier); // infinite values
     //   s1.limit(100).forEach(System.out::println);
/*        Stream<Float> s2 = Stream.iterate(0.0F, i->i+0.000000001F);// infinite loop, seed is the start value, and the UnaryOperator
        // you can use the limit method of course
        s2.limit(100000000).forEach(System.out::println);*/
        Stream<Integer> s3 = Stream.iterate(1,i->i<=10000,i->i+1);
        s3.forEach(System.out::println);
    }
    public Stream<Integer> m(){
        return Stream.empty();
    }
    public List<Integer> mm(){
        return Collections.emptyList();
    }
}
