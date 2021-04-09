package NonOrgr;

public class ano {
    final static int age;
    static {
     age = 1012;
        System.out.println("This is a static field "+age);
    }
    {

        System.out.println("This is a NON static field "+age);
    }
    ano(){
    }
    public static void main(String[] args) {
    ano.quiet();

    }
    public static void quiet(){
        System.out.println(" SHUT UP");
    }
}
