package Youssef;


public class Cat  extends Animal{
    static void m(){
    }

    public int N(){
        this.m();
        return 0;
    }
    public static void main(String[] args) throws ClassCastException {
        Animal a = new Cat();
    }

}
