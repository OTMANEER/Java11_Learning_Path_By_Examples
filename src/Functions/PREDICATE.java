package Functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PREDICATE {
    public static void main(String[] args) {
        Predicate<Integer> p = (x)->x%2==0;
        BiPredicate<String,Integer> p1 = (x,y)-> x.length() == y;
        boolean b=p1.test("otmane",6);

        System.out.println(b);
    }
}
