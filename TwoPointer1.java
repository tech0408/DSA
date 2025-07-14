package dsa;

import java.util.Arrays;

public class TwoPointer1 {

    public static void main(String[] args) {

        // [1,0,2,2,1,0,1,2,0,1]

        int [] arr = {1,0,2,2,1,0,1,2,0,1};

        int size = arr.length;
        int first =0;
        int second =first+1;
        int last = size-1;

        while(first<last){
            while(second<=last){
                int fN = arr[first];
                int sN = arr[second];
                if(fN>sN){
                    arr[first] =sN;
                    arr[second] =fN;
                    second++;
                }
                else{
                    second++;
                }
            }
            //System.out.println(Arrays.toString(arr));
        first++;
        second=first+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
