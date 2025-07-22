package dsa.Problems.Medium;

/*
    Example 1:

        Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
        Output: [[1,5],[6,9]]
        Example 2:

        Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        Output: [[1,2],[3,10],[12,16]]
        Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */

import java.util.Arrays;
import java.util.LinkedList;

public class AddNewInterval {

    public static int[][] addNewInterval(int [][] intervals, int [] newInterval){

        int len = intervals.length;
        boolean inserted=false;

        // if intervals is empty, add new interval and return.
        if(len==0){
            return new int[][]{newInterval};
        }

        LinkedList<int []> mergedList = new LinkedList<>(); // we choose LL as we do not know the size and it is dynamic.

        for(int [] interval: intervals){

            if(newInterval[0]<interval[0]){
                if(mergedList.isEmpty() || mergedList.getLast()[1]<newInterval[0]){
                    mergedList.add(newInterval);
                }
                else{
                    mergedList.getLast()[1]= Math.max(mergedList.getLast()[1],newInterval[1]);
                }
                inserted =true;
            }

            if(mergedList.isEmpty() || mergedList.getLast()[1]<interval[0]){
                mergedList.add(interval);
            }
            else{
                mergedList.getLast()[1]= Math.max(mergedList.getLast()[1],interval[1]);
            }
        }

        if(len==1 || !inserted){
            if(mergedList.getLast()[1]<newInterval[0]){
                mergedList.add(newInterval);
            }
            else{
                mergedList.getLast()[1]= Math.max(mergedList.getLast()[1],newInterval[1]);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }

    public static void main(String[] args) {

        //int [] [] intervals ={{1,3},{6,9}};
        //int [] [] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] [] intervals ={};
        //int [] newInterval = {2,5};
        int [] newInterval = {4,8};

        int [] [] newList = addNewInterval(intervals,newInterval);
        for(int [] interval : newList) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
