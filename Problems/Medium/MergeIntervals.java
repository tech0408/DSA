package dsa.Problems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if(len==1){
            return intervals;
        }
        //int [] [] result=new int [len][2];
        List<int[]> result = new ArrayList<>();
        for(int i=0;i<len-1;i++){

            int nInterLB = intervals[i+1][0];
            int nInterUB = intervals[i+1][1];
            int curInterUB = intervals[i][1];
            if(curInterUB>=nInterLB && curInterUB<=nInterUB){
                result.add(new int []{intervals[i][0],intervals[i+1][1]});
                i++;
            }
            else{
                result.add(intervals[i]);
            }
        }

        int len2 = result.size();

        if(intervals[len-1][1]!= result.get(len2-1)[1]){
            result.add(intervals[len-1]);
        }
        return result.toArray(new int[0][]);

    }

    public static void main(String[] args) {

       // int [] [] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [] [] intervals = {{1,3}};


        int [][] result = merge(intervals);
        int len = result.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}