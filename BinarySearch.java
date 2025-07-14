package dsa;

public class BinarySearch {

    public static void main(String[] args) {

        int [] nums = {12,45,56,67,69,145};
        int len = nums.length;

        boolean found = false;
        int num = 12;
        int first = 0;
        int last = len-1;
        while(first<last){

            int mid = first+ (last-first)/2;
            System.out.println(nums[mid]);
            if(nums[mid]==num){
                System.out.println("Number found at index : " +mid);
                found= true;
                break;
            }
            else if(nums[mid]>num){
                last = mid-1;
            }
            else{
                first= mid+1;
            }
        }
        if (!found){
            System.out.println("Number not found");
        }
    }
}
