package polymorphism;

public class themain {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        // THis work here because => a is a B but the reference is not correct!
        // For example if i write something like this today
        a.x =  101; // this  will not work because the reference is NonOrgr.A=> INT
        a.m(); // B
    }
}
