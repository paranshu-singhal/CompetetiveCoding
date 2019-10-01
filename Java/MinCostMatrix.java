import java.util.Scanner;

public class MinCostMatrix {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        int n = Integer.parseInt(scanner.nextLine().split(" ")[0]);

        int[][] A = new int[n][n];

        for(int i=0;i<n;i++){
            String[] str = scanner.nextLine().split(" ");
            for(int j=0;j<n;j++){
                A[i][j] = Integer.parseInt(str[j]);
            }
        }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.println(A[i][j]);
        //     }
        // }
        System.out.println(minCost(A, n, n-1, n-1));
        scanner.close();
    }

    static int minCost(int[][] A, int n, int i, int j){

        if(i<0 || j<0 || i>=n || j>=n) return 0;
        return A[i][j] + Math.min(
            minCost(A, n, i-1, j),
            minCost(A, n, i, j-1)
        );
    }
}