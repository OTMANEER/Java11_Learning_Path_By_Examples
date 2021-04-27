package Collectors;

import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class example1 {
    public static void main(String[] args) {
        List<String> list = List.of("OTMAEN","SALEH","MOHAMED","MOHAMED");
        Set<String> c = list.stream()
                .collect(Collectors.toSet());
        System.out.println(c);
    TreeSet<String> set = list.stream()
            .collect(Collectors.toCollection(TreeSet::new));
    }
}
