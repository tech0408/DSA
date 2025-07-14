import java.lang.*;
public class PrimeFactors {

    public static void main(String[] args) {
        int num1 = 11;
        //System.out.println(Math.sqrt(num1));
        int num=num1;
        while(num%2==0){
            System.out.print(2+ " ");
            num=num/2;
        }
        for(int i=3; i<num1;i=i+2){
            while(num%i ==0){
                System.out.print(i+ " ");
                num=num/i;
            }
        }
        if(num>2){
            System.out.print(num+ " ");  
        }
    }
    
}
