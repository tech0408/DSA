package dsa.stream_apis;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(3,1,4,1,5,9,2,6,6,5);

        int n=3;

        System.out.println(numbers.sorted(Comparator.reverseOrder()).skip(n-1).findFirst().get());
    }
}
