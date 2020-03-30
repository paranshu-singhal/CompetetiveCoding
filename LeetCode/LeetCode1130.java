class Solution {
    public int mctFromLeafValues(int[] arr) {
        
        int len = arr.length;
        
        int[][] dp = new int[len][len];
        int[][] max = new int[len][len];
        
        for(int k=0; k<len; k++){
            for(int i=0; i<len-k; i++){
                int j = i+k;
                if(i==j)  max[i][j] = arr[i];
                else max[i][j] = Math.max(arr[j], max[i][j-1]);  
            }
        }
        
        
        for(int m=0; m<len; m++){
            for(int i=0; i<len-m; i++){
                int j = i+m;
                
                int min = Integer.MAX_VALUE;
                
                for(int k=i; k<j; k++){
                    min = Math.min(min, max[i][k] * max[k+1][j] + dp[i][k] + dp[k+1][j]);
                }                
                
                dp[i][j] = (min == Integer.MAX_VALUE)?0 : min;
                
            }
        }
        
        return dp[0][len-1];
        
    }
}