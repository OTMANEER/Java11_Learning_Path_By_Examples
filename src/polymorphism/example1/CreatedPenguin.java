package polymorphism.example1;

public class CreatedPenguin extends Penguin {
    public static int getHeight() { return 8; }
    public static void main(String... fish) {
        CreatedPenguin c = new CreatedPenguin();
        c.printInfo();
    }
}