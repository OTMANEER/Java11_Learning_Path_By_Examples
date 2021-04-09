package LambdaExpressions.part1;

import LambdaExpressions.Instrument;

public class ex {
    public static void main(String[] args) {
        X i = (a,b)-> {
            System.out.println("OTANE");
        };
        X i1 = (int a,int b)-> {
            System.out.println("OTANE");
        };
        X i2 = (var a,var b)-> {
            System.out.println("OTANE");
        };

    }
}
