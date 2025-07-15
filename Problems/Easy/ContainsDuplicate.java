package dsa.Problems.Easy;


/*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        Example 1:

        Input: nums = [1,2,3,1]

        Output: true

        Explanation:

        The element 1 occurs at the indices 0 and 3.

        Example 2:

        Input: nums = [1,2,3,4]

        Output: false

        Explanation:

        All elements are distinct.

        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]

        Output: true
 */

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containDuplicate(int [] nums){

        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                return true;
            }
            freqMap.put(num, 0);
        }
        return false;
    }

    public static void main(String[] args) {

        int [] nums = {1,2,3,1};
        System.out.println(containDuplicate(nums));
    }
}
