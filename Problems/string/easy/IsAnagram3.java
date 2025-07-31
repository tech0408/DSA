package dsa.Problems.string.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram3 {

    public static boolean isAnagram(String str1, String str2){

        int len = str1.length();
        int len1 = str2.length();
        if(len != len1){
            return false;
        }

        Map<String,Integer> mp = new HashMap<>();
        char [] chs = str1.toCharArray();
        Arrays.sort(chs);
        String sKey = new String(chs);
        mp.put(sKey,1);

        chs = str2.toCharArray();
        Arrays.sort(chs);
        return mp.containsKey(new String(chs));
    }

    public static void main(String[] args) {
        //String s = "anagram";
        String s = "rac";
        String t = "car";
        //String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
