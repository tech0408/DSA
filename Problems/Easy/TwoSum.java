package dsa.Problems.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
 */
public class TwoSum {

    public static int[] findTwoSum(int [] nums, int target){

        Map<Integer,Integer> numMap = new HashMap<>();
        int len = nums.length;

        for(int i=0;i<len;i++){
            if(numMap.containsKey(target-nums[i])){
                return new int[]{numMap.get(target-nums[i]),i};
            }
            numMap.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int [] nums = {3,3}; // [2,7,11,15] -> 9 // [3,2,4] -> 6 // [3,3] -> 6
        int target = 6;
        System.out.println(Arrays.toString(findTwoSum(nums,target)));
    }
}
