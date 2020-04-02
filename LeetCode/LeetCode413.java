class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        
        int len = A.length;
        
        if(len < 3) return 0;
        
        int[] dp = new int[len];
        
        int i = 2;
        int ans=0;
        while(i < len){
                
            if(A[i] - A[i-1] == A[i-1] - A[i-2]){
                dp[i] = dp[i-1] + 1; 
            } 
            ans += dp[i];
            i++;
        }
        
        return ans;
    }
}