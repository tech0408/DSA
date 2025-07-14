package SlidingWindow;

// Using StringBuilder approach.
public class RemoveConsecutive {

    public static void main(String[] args) {
        
        String str = "geeksforgeeks";
        int len = str.length();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len-1;i++){
            if(str.charAt(i)!= str.charAt(i+1)){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());  
    }
    
}
