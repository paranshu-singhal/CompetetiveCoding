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
                
                    int min = Integer.MAX_VALUE; 

                    for(int k=0; k<n; k++){
                        if(j!=k) min = Math.min(min, dp[i+1][k]);
                    }

                    dp[i][j] = A[i][j] + min;
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