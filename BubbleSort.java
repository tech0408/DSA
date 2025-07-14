package dsa;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] nums = { 23,12,1,4,34,56,21};

        int len = nums.length;

        for(int i=0;i<len;i++){
            for(int j=0;j<len-1;j++){
                 if(nums[j]<nums[j+1]){
                     int temp = nums[j];
                     nums[j] = nums[j+1];
                     nums[j+1] = temp;
                 }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
