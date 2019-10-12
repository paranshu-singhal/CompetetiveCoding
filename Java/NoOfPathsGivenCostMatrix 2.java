import java.util.Scanner;

public class NoOfPathsGivenCostMatrix{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        String[] item = scanner.nextLine().split(" ");
        int n = Integer.parseInt(item[0]);
        int d = Integer.parseInt(item[1]);

        int[][] A = new int[n][n];

        for(int i=0;i<n;i++){
            String[] str = scanner.nextLine().split(" ");
            for(int j=0;j<n;j++){
                A[i][j] = Integer.parseInt(str[j]);
            }
        }
        scanner.close();

        System.out.println(numberOfPaths(A,n,n-1,n-1,d)); 
    }

    public static int numberOfPaths(int[][] A, int n, int i, int j, int cost){

        if(cost<0) return 0;

        if(i==0 && j==0){ 
            if(A[i][j]-cost==0) return 1;
            else return 0;
        }
        if(i==0) return numberOfPaths(A,n,0,j-1,cost-A[i][j]);
        if(j==0) return numberOfPaths(A,n,i-1,j,cost-A[i][j]);

        return numberOfPaths(A,n,i-1,j,cost-A[i][j]) + numberOfPaths(A,n,i,j-1,cost-A[i][j]);
    }
}