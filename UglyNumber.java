import java.util.*;
public class UglyNumber {
    
    public static void main(String[] args) {
        
        // Find the nth ugly number. 
        // Ugly number is the one which have the prime factors as 2 3 and 5.
        // 1 2 3 4 5 6 8 9 10 12 13
        // 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. 

        int n=5;
        TreeSet<Long> ts = new TreeSet<>();
        ts.add(1L);
        n--;
        while(n>0){
            long x = ts.first();
            ts.remove(x);
            ts.add(x*2);
            ts.add(x*3);
            ts.add(x*5);
            n--;
        }
        System.out.print(ts.first().intValue());
    }
}
