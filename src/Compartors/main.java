package Compartors;

import java.util.Comparator;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
      /*  Comparator <Dog> c =  new Comparator<Dog>() {
            @Override
            public int compare(Dog dog, Dog t1) {
                return  dog.getName().compareTo(t1.getName());
            } };*/

        var set = new TreeSet<Dog>();
        set.add(new  Dog("C",190));
        set.add(new Dog("A",19 ));
        set.add(new  Dog("D", 90));
        set.add(new Dog("Z",10));
        set.add(new Dog("E", 9));
        set.forEach(System.out::println);
    }
}
