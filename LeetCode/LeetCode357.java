
public class LeetCode357 {

    public int countNumbersWithUniqueDigits(int n) {
        
        
        if(n==0) return 1;
        if(n==1) return 10;
        if(n==2) return 91;
        if(n>=10) return 8877691;
        
        int[] dp = new int[11];
        dp[1] = 10;
        dp[2] = 91;
        
        int t = 81;
        int j=8;
        for(int i=3; i<=n; i++){
            t *=j;
            j--;
            dp[i] = dp[i-1] + t;
            //System.out.print(dp[i] + " ");
        }
        return dp[n];
    }
}