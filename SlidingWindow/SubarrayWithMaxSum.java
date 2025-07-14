package SlidingWindow;

public class SubarrayWithMaxSum {

    public static void main(String[] args) {

        int num [] = {100,200,300,400};
        // Ask -> find the value of maximum sum for a window of 2 elements.
        int k=2;
        int w_sum=0;
        for(int i=0; i<k; i++){
            w_sum = w_sum + num[i];
        }
        System.out.println(w_sum);

        int cur_sum = 0;
        for(int j=k; j<num.length; j++){
            cur_sum = w_sum + num[j] - num [j-k];
            System.out.println("curr_sum: "+ cur_sum);
            w_sum = Math.max(cur_sum, w_sum);
        }

        System.out.println(w_sum);
    }
}
