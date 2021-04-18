package Functions;

import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<Integer> sp =()->101;
        int a = sp.get();
        System.out.println(a);
        }
    }
