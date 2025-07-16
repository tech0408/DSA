package dsa.Problems.Medium;

import java.util.Arrays;

public class ProductExceptItself2 {

    public static int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int [] answer = new int[len];

        int leftProduct=1;
        int rightProduct=1;

        for(int i=0;i<len;i++){
            answer[i]= leftProduct;
            leftProduct = leftProduct*nums[i];
        }

        for(int i=len-1;i>=0;i--){
            answer[i]= answer[i]*rightProduct;
            rightProduct = rightProduct*nums[i];
        }

        return answer;

    }

    public static void main(String[] args) {

        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
