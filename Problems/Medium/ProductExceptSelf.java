package dsa.Problems.Medium;

/*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    You must write an algorithm that runs in O(n) time and without using the division operation.



    Example 1:

    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
    Example 2:

    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]
 */

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int [] nums){

        int len = nums.length;
        int [] answer = new int[len];
        int pos =0;
        int curpos=0;
        int product=1;

        while(pos<len){

            if(pos!=curpos){
                product= product*nums[curpos];
                curpos++;
            }
            else{
                curpos++;
            }
            if(curpos>len-1){
                curpos=0;
                answer[pos]=product;
                pos++;
                product=1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {


        int [] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
