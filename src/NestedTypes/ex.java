package NestedTypes;

public class ex {
    public static void main(String[] args) {
        Car c = new Car();
        Car.Engine e=  c.new Engine();
        e.run();
        e.run();
        e.run();
        System.out.println(c.getX());
    }
}
