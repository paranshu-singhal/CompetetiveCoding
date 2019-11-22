class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        if(len==0) return 0;
        if(len==1) return nums[0];
        
        return Math.max(dp_helper(nums, 0, len-2),dp_helper(nums, 1, len-1));
    }

    int dp_helper(int[] nums, int start, int end){
        int len = end-start+1;
        
        if(len==0) return 0;
        if(len==1) return nums[start];
        
        int[] dp = new int[len];
        
        dp[len-1] = nums[end];
        dp[len-2] = Math.max(nums[end-1], dp[len-1]);
        
        int k=len-3;
        
        for(int i=end-2; i>=start; i--,k--){
            dp[k] = Math.max(nums[i]+dp[k+2], dp[k+1]);
        }
        return dp[0];
    }
}