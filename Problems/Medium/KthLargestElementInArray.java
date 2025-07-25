package dsa.Problems.Medium;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KthLargestElementInArray {

    public static int kthLargestelement(int [] nums, int k){

        Optional<Integer> kthElement = IntStream.of(nums).boxed().sorted((a,b)-> b-a).distinct().skip(k-1).findFirst();
        return kthElement.get();
    }

    public static void main(String[] args) {

        int [] nums = {3,2,1,5,6,4};
        int k =2;
        System.out.println(kthLargestelement(nums, k));
    }
}
