package Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        // Function and BiFunction IN java
        /*Function<String,Integer> f = String::length;
      int a= f.apply("OTMANE");
        System.out.println(a);*/
        BiFunction<Integer,Integer,String> f2 = (x,y)-> x+""+y;
        String out = f2.apply(10,20);
        System.out.println(out);
    }

}
