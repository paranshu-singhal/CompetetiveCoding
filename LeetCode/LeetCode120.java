class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();
        int[][] dp = new int[n][n];

        int k=1;
        dp[0][0] = triangle.get(0).get(0);
        
        for(int i=1; i<n; i++){
            for(int j=0; j<=k; j++){
                if(j==0){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                } else if(j==k){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                } else{
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
            k++;
        }
        int r = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            r = Math.min(r, dp[n-1][i]);
        }
        return r;
    }
}