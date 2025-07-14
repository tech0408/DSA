package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        int num = 5;

        // Create Map using java streams with key as first char and value as latest overridden value
        var list = Arrays.asList("EPAM","EPAM2","Java","Javascript");
        //Expects: {E=EPAM2, J=Javascript}
//        Map<Character,String> map = list.stream().collect(
//                Collectors.toMap(s->));

        //int len = list.size();

        Map<Character,String> mp = new HashMap<>();
        for(String s : list){

            if(!mp.containsKey(s.charAt(0))){
                mp.put(s.charAt(0),s);
            }
        }
        System.out.println(mp);

        //Count the elements in increasing sequence
        int[] nums = {1, 2, 1, 3, 2, 2, 4, 3, 7, 9, 10, 12, 11};
        //Output: 8  i.e [1, 2, 3, 4, 7, 9, 10, 12]

        int size = nums.length;
        int count = 1;
        for(int i=0;i<size-1;i++){
            if(nums[i+1]> nums[i]){
                count++;
            }
        }
        System.out.println(count);

        int s = 2, x =4;

        s= s+x;
        x= s-x;
        s= s-x;
        System.out.println(s +":"+x);
    }
}
