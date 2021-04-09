package Exceptions;

public class Example1 extends RuntimeException {
    public Example1() {
        super("My unckecked Exception");
    }

    public static void main(String[] args) {
        var r = new Example1();
        throw r;
    }
}
