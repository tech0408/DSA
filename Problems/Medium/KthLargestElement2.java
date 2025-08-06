package dsa.Problems.Medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement2 {

    public int kthLargest(int [] nums, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int len = nums.length;

        for(int i=0;i<len;i++){

        }

        return 0;
    }

    public void main(String[] args) {

        int [] nums = {3,2,1,5,6,4};
        int k= 2;
        System.out.println(kthLargest(nums,k));
    }
}
