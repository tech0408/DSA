package dsa.Problems.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static Map<Character,Integer> stringToMap(String str){

        int len = str.length();
        Map<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch,1);
            }
        }
        System.out.println(mp);
        return mp;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        int len = strs.length;
        List<List<String>> res = new ArrayList<>();
        List<String> visited = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            List<String> temp = new ArrayList<>();
            Map<Character, Integer> mp1 = stringToMap(strs[i]);
            temp.add(strs[i]);
            if(!visited.contains(strs[i])){
                visited.add(strs[i]);
            }
            else{
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                Map<Character, Integer> mp2 = stringToMap(strs[j]);
                if (!temp.contains(strs[j]) && mp1.equals(mp2) && !visited.contains(strs[j])) {
                    visited.add(strs[j]);
                    temp.add(strs[j]);
                }
            }
            res.add(temp);
        }
        return res;
    }


    public static void main(String[] args) {

        //String [] strs = {"eat","tea","tan","ate","nat","bat"};
        //String [] strs = {""};
        String [] strs = {"",""};
        System.out.println(groupAnagrams(strs));
    }
}
