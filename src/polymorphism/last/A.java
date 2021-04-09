package polymorphism.last;

public interface A {
    default void m(){
        System.out.println("FROM NonOrgr.A");
    }
    default void m1(){
        System.out.println("FROM NonOrgr.A");
    }
}
