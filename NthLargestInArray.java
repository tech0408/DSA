package dsa;

import java.util.*;

public class NthLargestInArray {


    // Function which computes nth largest and return the value.
    static List<Integer> nthLargestElement(int n, int nums[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count =0;
        for(int num :nums){
            pq.add(num);
            count++;
            if(count>n){
                pq.poll();
                count--;
            }
        }

        return new ArrayList<>(pq);
    }
    public static void main(String[] args) {

        int [] nums = {12,23,1,34,56,10,4};

        List<Integer> elements = nthLargestElement(3,nums);

        elements.stream().sorted(Comparator.comparingInt(num->(Integer)num).reversed()).forEach(System.out::println);
    }
}
