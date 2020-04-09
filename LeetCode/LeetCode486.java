class Solution {
    public boolean PredictTheWinner(int[] nums) {
        
        int n = nums.length;
        
        int[][] dp = new int[n][n];
        
        boolean is1 = (n%2==0) ? false:true;
        
        for(int k=0; k<n; k++){
            
            for(int i=0; i<n-k; i++){
                
                int j = i+k;
                    
                if(i==j){
                    if(is1 == true) dp[i][j] = nums[j];
                    else dp[i][j] = -nums[j];
                }
                
                else {
                    if(is1 == true){
                        dp[i][j] = Math.max(nums[i] + dp[i+1][j], nums[j] + dp[i][j-1]);
                    } else {
                        dp[i][j] = Math.min(-nums[i] + dp[i+1][j], -nums[j] + dp[i][j-1]);
                    }
                }
            }
            is1 = (is1)?false:true;
        }
        
        return (dp[0][n-1]>=0 ? true:false);
    }
}