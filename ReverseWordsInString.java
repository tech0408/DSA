import java.util.*;
class ReverseWordsInString {
    public static void main(String args []){
        String str ="I.like.this.program.very.much";
        Stack<String> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // expected output -> much.very.program.this.like.I
        int len = str.length();
        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(ch !='.'){
                sb.append(ch);
            }
            else{
                stk.push(sb.toString());
                sb= new StringBuilder();
            }

            //Special case to handle the delimiter at end.
            if(i==len-1){
                stk.push(sb.toString());
            }
        }
        System.out.println(stk);
        while(!stk.isEmpty()){
           System.out.print(stk.pop());
           if(!stk.isEmpty()){
            System.out.print(".");
           } 
        }
    }
}