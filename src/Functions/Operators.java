package Functions;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Operators {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (s)->s+" NOWAY";
      /*  System.out.println(unaryOperator.apply("RED LBAL"));*/
      //  UnaryOperator<String> u2 = n->new StringBuilder(n).reverse().toString();
        BinaryOperator<Integer> c =Integer::sum;
        System.out.println(c.apply(10,20));
    }
}
