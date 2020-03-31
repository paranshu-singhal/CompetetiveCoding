class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        
        int[][] dp = new int[len][len];
        
        for(int k=0; k<len; k++){
            for(int i=0; i<len-k; i++){
                int j=i+k;
                
                if(i==j){
                    dp[i][j] = 1;
                    continue;
                } 
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j] , dp[i][j-1]);
                }
            }
        }
        
        return dp[0][len-1];
    }
}