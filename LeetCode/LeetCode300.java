class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int len = nums.length;
        if(len==0) return 0;
        
        int[] dp = new int[len];
        
        for(int i=0; i<len;i++){
            
            int max = 0;
            
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]) max = Math.max(max,1+dp[j]);
            }
            dp[i] = max;
        }

        int result = Integer.MIN_VALUE;
        for(int i=0; i<len;i++) result = Math.max(result,dp[i]);
        return (result+1);
    }
}