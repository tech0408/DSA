package dsa.Problems.Medium;

/*
    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

    There is only one repeated number in nums, return this repeated number.

    You must solve the problem without modifying the array nums and using only constant extra space.



    Example 1:

    Input: nums = [1,3,4,2,2]
    Output: 2
    Example 2:

    Input: nums = [3,1,3,4,2]
    Output: 3
    Example 3:

    Input: nums = [3,3,3,3,3]
    Output: 3
 */

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {

    public static int findDuplicate(int [] nums){

        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num:nums){
            if(freqMap.containsKey(num)){
                return num;
            }
            freqMap.put(num,0);
        }
        return 0;
    }

    public static void main(String[] args) {

        int [] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));

    }
}
