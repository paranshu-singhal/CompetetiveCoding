class Solution {
    public int maxSumDivThree(int[] nums) {
        
        int n = nums.length;
        
        int[][] dp = new int[3][n];
        
        int cur = nums[0];
        dp[cur%3][0] = cur;
        
        for(int j=0; j<n-1; j++){
            for(int i=0; i<3; i++){
                
                dp[i][j+1] = Math.max(dp[i][j], dp[i][j+1]);
                cur = (dp[i][j] + nums[j+1]);
                dp[cur%3][j+1] = Math.max(dp[cur%3][j+1], cur);
            }
        }
        return dp[0][n-1];
    }
}