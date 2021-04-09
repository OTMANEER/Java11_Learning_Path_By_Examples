package NestedTypes;

public class Car {
    private int x;

    class Engine{
        void run(){
            Car.this.x++;
        }
    }

    public Car( ) {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
