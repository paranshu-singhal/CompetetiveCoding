class Solution {
    
    public int[][] matrixBlockSum(int[][] mat, int K) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        int[][] dp = new int[m][n];
        
        dp[0][0] = mat[0][0];
        
        for(int i=1; i<m; i++){
            dp[i][0] = dp[i-1][0] + mat[i][0];
        }
        for(int i=1; i<n; i++){
            dp[0][i] = dp[0][i-1] + mat[0][i];
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] + mat[i][j] - dp[i-1][j-1];
            }
        }
        
        int r1, c1, r2, c2;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                r1 = i-K-1; c1 = j-K-1;
                
                r2 = i+K; c2 = j+K;
                if(r2>=m) r2=m-1;
                if(c2>=n) c2=n-1;
                
                if(r1<0 && c1<0) mat[i][j] = dp[r2][c2];
                else if(r1<0) mat[i][j] = dp[r2][c2] - dp[r2][c1];
                else if(c1<0) mat[i][j] = dp[r2][c2] - dp[r1][c2];
                else {
                    mat[i][j] = dp[r2][c2] - dp[r1][c2] - dp[r2][c1] + dp[r1][c1];
                }
            }
        }
        
        return mat;
          
    }
}