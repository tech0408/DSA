package dsa.Problems.string.medium;

public class LongestPalindrome {


    public String longestPalindrome(String s) {

        int len = s.length();
        int first =0;
        int last = len-1;
        String maxSubString="";
        int maxLength=0;

        while(first<last){

            char ch1 = s.charAt(first);
            char ch2 = s.charAt(last);
            int index =-1;
            if(ch1==ch2){
                if(index==-1){
                    index = last;
                }
                first++;
                last--;
            }
            else{
                last--;
                if(last==first){
                    first++;
                    last=len-1;
                }
            }

            if(first==last){
                if(maxSubString.length() < s.substring(first,index+1).length()){
                    maxSubString = s.substring(first,index+1);
                }
                index=-1;
            }
        }


        return s;
    }

    public static void main(String[] args) {

        String s ="babad";
    }
}
