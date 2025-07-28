package dsa.Problems.string.easy;


/*
    1.Given a string s, find the length of the longest substring without repeating characters.
        Example 1:
                   Input: s = "abccabcbb"
                   Output: 3
                   Explanation: The answer is "abc", with the length of 3.
        Example 2:
                   Input: s = "bbbbb"
                   Output: 1
                    Explanation: The answer is "b", with the length of 1.
        Example 3:
                    Input: s = "pwwkew"
                    Output: 3
                     Explanation: The answer is "wke", with the length of 3.
 */

public class LongestsubStringWithRepeatingCharacters {


    public static int longestsubstring(String str){

        int len = str.length();

        int [] visited = new int[26];
        String temp="";
        int maxLen = 0;
        for(int i=0;i<len;i++){

            char ch = str.charAt(i);
            if(visited[ch-'a']==0){
                visited[ch-'a']=1;
                temp=temp+ch;
            }
            else{
                maxLen = Math.max(maxLen,temp.length());
                temp="";
                visited = new int[26];
                i=i-1;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

         //String s = "abccabcbb";
        //String s = "bbbbb";
        String s = "pwwkew";

        System.out.println(longestsubstring(s));
    }
}
