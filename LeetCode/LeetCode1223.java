class Solution {
    public int dieSimulator(int n, int[] rollMax) {
        int len = rollMax.length;
        
        if(n==1) return 6;
        
        int[][] dp = new int[n][6];
        int[] total = new int[n];
        
        for(int j=0; j<6; j++) dp[0][j] = 1;
        total[0] = 6;
        
        int mod = 1000000007;
        
        for(int i=1; i<n; i++){
            int sum = 0;
            for(int j=0; j<6; j++){
                dp[i][j] = total[i-1];
                
                if(i - rollMax[j] >= 1){
                    dp[i][j] = ((dp[i][j] - total[i - rollMax[j] - 1] + dp[i-rollMax[j]-1][j]) % mod + mod)%mod;
                } else if(i - rollMax[j] == 0){
                    dp[i][j]--;
                }
                sum = (sum + dp[i][j]) % mod;
            }
            total[i] = sum;
            //System.out.println(Arrays.toString(dp[i]));
        }
    
        return total[n-1];
    }
}