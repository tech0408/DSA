package dsa.Problems.string.easy;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram2 {

    public static boolean isAnagram(String str1, String str2){

        int len = str1.length();
        int len2 = str2.length();
        if(len!=len2){
            return false;
        }

        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<len;i++){
            char ch = str1.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
            else{
                mp.put(ch,1);
            }
        }

        for(int i=0;i<len;i++){
            char ch = str2.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)-1);
            }
        }

        System.out.println(mp);
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "rat";
        String t = "car";
        //String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
