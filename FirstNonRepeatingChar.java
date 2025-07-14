import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str ="aabbddd";
        int len = str.length();
        int count=0;
        boolean flag = true;
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            count=0;
            flag=true;
            if(!al.contains(ch)){
                al.add(ch);
                for(int j=i+1;j<len;j++){
                    char ch1 = str.charAt(j);
                    if(ch==ch1){
                        count++;
                        flag=false;
                    }
                }
                if(count==0){
                    System.out.print(ch);
                    flag=false;
                    break;
            }
        }
        }
        //System.out.print(al);
        //System.out.print(flag);
        if(flag){
            System.out.print("$");
        }
    }
    
}
