class Solution {
    int ans=0;
    public int findTargetSumWays(int[] nums, int S) {
        
        if(S > 1000) return 0;
        
        int n = nums.length;
        
        int[][] dp = new int[2001][n];
        
        dp[nums[0] + 1000][0] = 1;
        dp[-nums[0] + 1000][0] += 1;
        
        for(int i=1; i<n; i++){
            
            for(int sum = -1000; sum<=1000; sum++){
                if (dp[sum + 1000][i-1] > 0) {
                    dp[sum + 1000 - nums[i]][i] += dp[sum + 1000][i-1];
                    dp[sum + 1000 + nums[i]][i] += dp[sum + 1000][i-1];
                }
            }
        }
        return dp[S + 1000][n-1];
    }
    
}