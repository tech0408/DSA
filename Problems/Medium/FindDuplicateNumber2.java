package dsa.Problems.Medium;

public class FindDuplicateNumber2 {

    public static int findDuplicate(int [] nums){
        int low =0;
        int high=0;
        do{
            low = nums[low];
            high = nums[high];
            high = nums[high];
        }while(low!=high);

        low=0;
        while(nums[low]!= nums[high]){
            low = nums[low];
            high = nums[high];
        }
        return nums[low];
    }

    public static void main(String[] args) {

        int [] nums = {3,1,3,4,2};

        System.out.println(findDuplicate(nums));

    }
}
