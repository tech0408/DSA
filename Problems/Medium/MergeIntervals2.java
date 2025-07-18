package dsa.Problems.Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals2 {

    public static int [][] mergeIntervals(int [] [] intervals){

        // sort the interval based on start value of each interval.
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> mergedIntervals = new LinkedList<>();
        for(int [] interval: intervals){

            if(mergedIntervals.isEmpty() || mergedIntervals.getLast()[1]< interval[0]){
                mergedIntervals.add(interval);
            }
            else{
                mergedIntervals.getLast()[1]= Math.max(mergedIntervals.getLast()[1],interval[1]);
            }
        }
        return mergedIntervals.toArray(new int [mergedIntervals.size()][]);
    }

    public static void main(String[] args) {

        int [] [] intervals = {{1,3},{2,6},{8,10},{15,18}};

        int [] [] result = mergeIntervals(intervals);
        for(int [] res : result){
            System.out.println(Arrays.toString(res));
        }
        //System.out.println(Arrays.toString(mergeIntervals(intervals)));

    }
}
