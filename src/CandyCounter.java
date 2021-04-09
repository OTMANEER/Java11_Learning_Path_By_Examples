import java.util.ArrayList;
import java.util.List;

   public class CandyCounter {

       public static void main(String[] args) {
           Foo<? extends Number> foo = new Foo<>(10);

            System.out.println(foo.x);
       }
   }