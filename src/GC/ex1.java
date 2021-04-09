package GC;

public class ex1 {
    public static void main(String[] args) {
        m();
    }
    static void m(){
        m2();
    }
    static void m2(){
        m3();
    }
    static void m3(){
        new RuntimeException().printStackTrace();
    }
}
