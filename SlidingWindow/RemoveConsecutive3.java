package SlidingWindow;

public class RemoveConsecutive3 {

    public static void main(String[] args) {
        
        String str = "aabbaaaaavvvvddddff";
        int i=0;
        StringBuilder sb = new StringBuilder();
        int len = str.length();

        for(int j=i+1;j<len;j++){
            if(str.charAt(i)==str.charAt(j)){
                continue;
            }
            else{
                sb.append(str.charAt(j));
                i++;
                System.out.println(sb.toString());
            }
        }

        System.out.println(sb.toString());
    }
    
}
