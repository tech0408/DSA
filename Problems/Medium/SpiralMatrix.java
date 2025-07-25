package dsa.Problems.Medium;


/*
    Given an m x n matrix, return all elements of the matrix in spiral order.

    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [1,2,3,6,9,8,7,4,5]

    Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
    Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> getSpiralMatrix(int [] [] matrix){

        int topRow = 0;
        int bottomRow = matrix.length-1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length-1;

        List<Integer> result = new ArrayList<>();

        while(topRow<= bottomRow && leftColumn<=rightColumn){

            // Traverse the top row. (left-> right)
            for(int i=leftColumn;i<=rightColumn;i++){
                result.add(matrix[topRow][i]);
            }
            topRow++;

            // Traverse the right column. (top->bottom)
            for(int i=topRow;i<=bottomRow;i++){
                result.add(matrix[i][rightColumn]);
            }
            rightColumn--;

            if(topRow<=bottomRow){

                // Traverse the last row. (right->left)
                for(int i=rightColumn;i>=leftColumn;i--){
                    result.add(matrix[bottomRow][i]);
                }

                bottomRow--;
            }

            if(leftColumn<=rightColumn){

                // Traverse the first column. (bottom-> top)
                for(int i=bottomRow;i>=topRow;i--){
                    result.add(matrix[i][leftColumn]);
                }
                leftColumn++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

       // int [] [] matrix = {{1,2,3},{4,5,6},{7,8,9}}; // O/p -> {1,2, 3, 6, 9, 8, 7, 4, 5}

        int [][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}; // O/p -> {1,2,3,4,8,12,11,10,9,5,6,7}

        System.out.println(getSpiralMatrix(matrix));

    }
}
