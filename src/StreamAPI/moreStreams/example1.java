package StreamAPI.moreStreams;

import java.util.List;
import java.util.stream.Stream;

public class example1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,210,201,284,86,8494,1009);
        System.out.println(list.stream().anyMatch(i -> i % 2 == 0));
        System.out.println(list.stream().noneMatch(i -> i % 2 == 0));
        System.out.println(list.stream().allMatch(i -> i % 2 == 0));
        Stream<Integer> s = Stream.of(1,201,29901,100,10001,120);
        s.forEach(x-> {
            try {
                m(x);
            } catch (Exception e) {
                System.out.println("ow");
            }
        });
    }
    public static void m(int x)throws Exception{
        if(x%2==0)
            throw new Exception("ow");
        System.out.println(x);
    }
}
