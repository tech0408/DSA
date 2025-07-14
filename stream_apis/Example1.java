package dsa.stream_apis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {

        // Find the sum of all integers.
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(2,4,5),
                Arrays.asList(4,67,34),
                Arrays.asList(32,44,23)
        );

        System.out.println(nestedList.stream().flatMap(list->list.stream()).reduce(0,Integer::sum));

        System.out.println(nestedList.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum());


        String s ="abcabcabcdddeeeff";

        Map<Character, Long> mp = s.chars().mapToObj(c->(char)c).collect(
                Collectors.groupingBy(Function.identity(),
                        Collectors.counting())
        );
        System.out.println(mp);

        // Character which occurs maximum times.
        Optional<Map.Entry<Character, Long>> entry  = s.chars().mapToObj(c->(char)c).collect(
                Collectors.groupingBy(c->c,Collectors.counting())
        ).entrySet().stream().min(Map.Entry.comparingByValue());

        entry.ifPresent(System.out::println);
    }
}
