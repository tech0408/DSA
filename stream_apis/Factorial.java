package dsa.stream_apis;

import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {

        int number=5;

        System.out.println(IntStream.rangeClosed(1, number).reduce(1,(a,b)->a*b));
    }
}
