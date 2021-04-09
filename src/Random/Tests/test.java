package Random.Tests;

public class test {
    public void talk(int ages){
        System.out.println("int "+ages);
    }
    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.howMany(true, new boolean[2]));
    }
}
