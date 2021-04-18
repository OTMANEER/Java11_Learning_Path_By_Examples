package Functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    /*Consumer
    BitConsumer
            Function
    BitFunction
    Predicate
    BitPredicate
    */

    public static void main(String[] args) {
        Consumer<String> consumer = s-> System.out.println(s); // Consume a value and don't return anything
        //consumer.accept("OTMANE"); // The Only function


        BiConsumer<String,Integer> biConsumer = (s,ss)-> System.out.println("S1: "+s+" S2: "+ss);
        biConsumer.accept("otmane",1998);
    }
}
