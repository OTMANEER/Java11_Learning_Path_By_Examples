package NonOrgr;

public class bottle {
    private final double volume;
    static {
        System.out.println("This is a static bloc befor the constructor");
    }
    public bottle(final double volume) {
        this.volume = volume;
    }
    static {
        System.out.println("After the constructor");
    }
    {
        System.out.println("The last field IS not Static");
    }

    public static void sayMeow() {
        System.out.println("Sorry i cannot say it now" +
                "");
    }

    public void setVolume(final double volume){
       // this.volume = volume; //This will not work because the value is final so we cannot really modify
    }
    public static void main(String[] args) {
        bottle b = new bottle(12D);
        System.out.println(b.toString());
    }
}
    class Foo{
    int age;
    static int status;
            public Foo(int age){
                this.age = age;
            }

    class Cat{
            String name;

                Cat( String name){
                    System.out.println("NonOrgr.A cat is created :)");
                }
            }
}