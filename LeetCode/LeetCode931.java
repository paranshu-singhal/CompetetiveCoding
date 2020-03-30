class Solution {
    public int minFallingPathSum(int[][] A) {
        
        int m = A.length;
        int n = A[0].length;
        
        int[][] dp = new int[m][n];
        
        if(m==1) return A[0][0];
        
        for(int i=m-1; i>=0; i--){
            for(int j=0; j<n; j++){
                if(i==m-1){
                    dp[i][j] = A[i][j]; 
                } else {  
                    if(j==0){
                        dp[i][j] = A[i][j] + Math.min(dp[i+1][j], dp[i+1][j+1]);
                        //else dp[i][j] = A[i][j] + dp[i+1][j];
                    } else if(j==n-1){
                        dp[i][j] = A[i][j] + Math.min(dp[i+1][j], dp[i+1][j-1]);
                        //else dp[i][j] = A[i][j] + dp[i+1][j];
                    }
                    else {
                        dp[i][j] = A[i][j] + Math.min(dp[i+1][j], Math.min(dp[i+1][j-1], dp[i+1][j+1]));
                    }
                }
            }
        }
    
        int ans = Integer.MAX_VALUE;                                        
        for(int j=0; j<n; j++){
            ans = Math.min(ans, dp[0][j]);
        }
        return ans;
    }
}