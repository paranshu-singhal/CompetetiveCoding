class Solution {
    public int numRollsToTarget(int d, int f, int target) {
        
        final int mod = 1000000007;
        
        int[][] dp = new int[d+1][target+1];
        
        for(int i=1; i<=d; i++){
            for(int j=i; j<=target; j++){
                if(i==1 && j<=f) dp[i][j] = 1;
                
                else if(i>1) {
                    for(int k = j-1; k>= j-f && k>=0; k--){
                        dp[i][j] = (dp[i][j] + dp[i-1][k]) % mod;
                    }
                    //long t = (dp[i][j-1] + dp[i-1][j-1]);
                    //dp[i][j] = (int)((j-f-1>=0)?(t%mod - dp[i-1][j-f-1])%mod: t%mod);
                }
            }
        }
        return dp[d][target];
    }
}