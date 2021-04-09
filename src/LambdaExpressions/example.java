package LambdaExpressions;

public class example {
    public static void main(String[] args) {
        Instrument i = () ->System.out.println("OTMANE"); // Lambda Expression
        i.play();
    }
}
