class Solution {
    public int findLength(int[] A, int[] B) {
        
        int m = A.length;
        int n = B.length;
        
        int[][] dp = new int[m][n];
        
        int result = Integer.MIN_VALUE;
        
        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                if(A[i] == B[j]){
                    if(i>0 && j>0){
                        dp[i][j] = 1+dp[i-1][j-1];
                        result = Math.max(result, dp[i][j]);
                    } else{ 
                        dp[i][j] = 1;
                        result = Math.max(result, dp[i][j]);
                    } 
                }
            }
        }
        return (result>Integer.MIN_VALUE)?result:0;
    }
}