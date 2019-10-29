/**
 * LeetCode48
 */
import java.util.ArrayList;
public class LeetCode48 {

    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(matrix);
        
    }

    public static void rotate(int[][] matrix) {
        
        int n = matrix.length;

        for(int i=0; i<n; i++){

            int buffer = matrix[i][n-1];
            matrix[i][n-1] = matrix[0][i];
            int buffer2 = matrix[n-1][n-i-1];
            matrix[n-1][n-i-1] = buffer;
            buffer = matrix[n-i-1][0];
            matrix[n-i-1][0] = buffer2;
            matrix[0][i] = buffer;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.print("\n");
        }
    }
}