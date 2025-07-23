package dsa.Problems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.

    You must do it in place.
    ex 1: Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
          Output: [[1,0,1],[0,0,0],[1,0,1]]

    ex 2: Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
          Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */

public class SetZeroes {

    public static void setZeroes(int [][] matrix){

        int rows = matrix.length;
        int columns = matrix[0].length;
        List<int[]> trackList = new ArrayList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]==0){
                    trackList.add(new int[] {i,j});
                }
            }
        }

        for(int[] ele: trackList){

            int row = ele[0];
            int col = ele[1];
            for(int i=0;i<columns;i++){
                matrix[row][i]=0;
            }
            for(int i=0;i<rows;i++){
                matrix[i][col]=0;
            }
        }
    }
    public static void main(String[] args) {

        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int [] mat: matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}
