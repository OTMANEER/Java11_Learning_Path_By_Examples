package polymorphism.moreInterf;

public class AA   implements A,C{ // NO PROBLEM BUT THERE IS NO FUNCTIONNAL INTERFACE here
    public static void main(String[] args) {
       AA a=  new AA();
        a.m();
        a.string();
    }
}
