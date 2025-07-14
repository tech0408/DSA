package dsa;

import java.util.ArrayList;
import java.util.List;

public class ThreeDistinctLargest {
    public static void main(String[] args) {

       // int [] nums = { 12,3,45,67,2,19,89,33,67,89};
        int [] nums = {12,9,9};
        List<Integer> res = new ArrayList<>();

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num < firstMax && num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num < secondMax && num > thirdMax) {
                thirdMax = num;
            }
        }
        if (firstMax != Integer.MIN_VALUE) res.add(firstMax);
        if (secondMax!= Integer.MIN_VALUE) res.add(secondMax);
        if(thirdMax!=Integer.MIN_VALUE) res.add(thirdMax);
        System.out.println(res);

    }
}
