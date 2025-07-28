package dsa.Problems.string.easy;

import java.util.HashMap;
import java.util.Map;

public class Isanagram {


    public static boolean isAnagram(String s, String t){

        int len = s.length();
        int len1 = t.length();
        if(len!=len1){
            return false;
        }

        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();

        for(int i=0;i<len;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mp1.containsKey(ch1)){
                mp1.put(ch1,mp1.get(ch1)+1);
            }
            else{
                mp1.put(ch1,1);
            }

            if(mp2.containsKey(ch2)){
                mp2.put(ch2,mp2.get(ch2)+1);
            }
            else{
                mp2.put(ch2,1);
            }
        }
        return mp1.equals(mp2);
    }

    public static void main(String[] args) {

        //String s = "anagram";
        String s = "rat";
        String t = "car";
        //String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
