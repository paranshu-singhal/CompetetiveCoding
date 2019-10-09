import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        
        //System.out.println("hello world");

        Scanner scanner = new Scanner(System.in); 
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);

        int[] V = new int[n];
        int[] W = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++)  V[i] = Integer.parseInt(aItems[i]); 

        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        aItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++)  W[i] = Integer.parseInt(aItems[i]); 

        System.out.println(knapsack(W,V,0,d));

        scanner.close();
    }

    static int knapsack(int[] W, int[] V, int i, int wt){

        if(i==W.length - 1) return V[V.length-1];
        if(wt==0) return 0;

        return Math.max(
            V[i] + knapsack(W,V,i+1, wt-W[i]),
            knapsack(W,V,i+1, wt)
        );

    }

    // public static int findFibonacci(int n){
        
    //     if(n==0)    return 0;
    //     if(n<=2)    return 1;
    //     return findFibonacci(n-1) + findFibonacci(n-2);
    // }
}