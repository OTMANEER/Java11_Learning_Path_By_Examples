package LambdaExpressions.part2;

public class ex {
    public static void main(String[] args) {
        Z z= ()-> 10;
        Z zz = ()-> q();
        Z zzz = ()->{
            return 102;
        };
    }

    private static int q() {
        return 1;
    }
}
