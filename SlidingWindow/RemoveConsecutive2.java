package SlidingWindow;

// Using brute force method.
public class RemoveConsecutive2 {

    public static void main(String[] args) {
        
        String str = "aaabbbddmmbcccdddddd";
        int len = str.length();
        String temp="";
        for(int i =0;i<len; i++){
            char ch = str.charAt(i);
            temp = temp + ch;
            for(int j=i+1; j<len; j++){
                char ch1 = str.charAt(j);
                if(ch == ch1){
                    i++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(temp);
    } 
}
