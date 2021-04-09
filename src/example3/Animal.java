package example3;

public class Animal {
    private int age;
    public void Animal( ){
         this.age = 101;
    }
    public Animal(){
    }
    public static void main(String[] args) {
        var a = new Animal();
        a.Animal();
        System.out.println(a.age);
    }
}
