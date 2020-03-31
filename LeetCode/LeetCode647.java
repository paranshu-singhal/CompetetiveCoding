class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length();
        
        boolean[][] dp = new boolean[len][len];
        
        int count = 0;
        
        for(int k=0; k<len; k++){
            for(int i=0; i<len - k; i++){
                int j = i+k;
                
                if(i==j) { dp[i][j] = true; count++; }
                else {
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = (j-i>1)?dp[i+1][j-1]: true;
                        if(dp[i][j]) count++;
                    }
                }
            }
        }
        return count;
    }
}