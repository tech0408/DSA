package dsa.Problems.string.medium;

import java.util.*;

public class GroupAnagrams2 {

    public static List<List<String>> groupAnagrams(String [] strs){

        Map<String,List<String>> mp = new HashMap<>();
        for (String str : strs) {
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String sKey = new String(characters);
            if (mp.containsKey(sKey)) {
                mp.get(sKey).add(str);
            } else {
                mp.put(sKey,new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(mp.values());
    }

    public static void main(String[] args) {

        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
