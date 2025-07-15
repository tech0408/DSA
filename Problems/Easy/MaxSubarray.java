package dsa.Problems.Easy;

/*
    Given an integer array nums, find the subarray with the largest sum, and return its sum.
    Example 1:

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    Example 2:

    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.
    Example 3:

    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */

public class MaxSubarray {


    public static int maxSum(int [] nums){


        int len = nums.length;
        int maxSum = nums[0];
        int curSum = 0;
        for(int i=0;i<len;i++){
            curSum= curSum+nums[i];
            maxSum = Math.max(maxSum,curSum);
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        // Kandan's algorithm

        int [] nums = {5,4,-1,7,8};

        System.out.println(maxSum(nums));
    }
}
