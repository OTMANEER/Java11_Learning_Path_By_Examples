package LambdaExpressions.part3;

import java.util.function.Function;

public class ex {
    public static void main(String[] args) {
        reverse r = x -> new StringBuilder(x).reverse().toString();
        String y =r.reverse("OTMANE");
        System.out.println(y);

        // Mathematical functions
        // Function
        Function<String,String> f = x-> new StringBuilder(x).reverse().toString();
        String o = f.apply("otmane");
        System.out.println(o);
    }
}
