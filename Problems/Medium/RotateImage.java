package dsa.Problems.Medium;
import java.util.Arrays;

public class RotateImage {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int [] [] tempMatrix= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tempMatrix[i][j] = matrix[i][j];
            }
        }

        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][k] = tempMatrix[i][j];
            }
            k--;
        }

        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {

        //int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }
}
