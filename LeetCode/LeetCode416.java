class Solution {
    public boolean canPartition(int[] nums) {
     
        
        //Arrays.sort(nums);
        
        int sum1 = 0;
        for(int num: nums) sum1+=num;
        
        if(sum1%2 != 0) return false;
        int target = sum1/2;
        
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        
        for(int num: nums){
            for(int i=target; i>=num; i--){
                dp[i] = dp[i] || dp[i-num];
            }
        }
        return dp[target];
    }
}