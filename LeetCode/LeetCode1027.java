class Solution {
    public int longestArithSeqLength(int[] A) {
        
        Map<Integer, Integer>[] dp = new HashMap[A.length];
        
        for (int i = 0; i < A.length; i++) {
            dp[i] = new HashMap<Integer, Integer>();
        }
        
        int ans = Integer.MIN_VALUE;
        
        for(int i=1; i<A.length; i++){
            
            for(int j=0; j<i; j++){
                
                int d = A[i] - A[j];
                
                // if(dp[j].containsKey(d)){
                //     dp[i].put(d, dp[j].get(d) + 1);
                // } else {
                //     dp[i].put(d, 2);
                // }
                
                int t = dp[j].getOrDefault(d,1) + 1;
                
                dp[i].put(d, t);
                
                ans = Math.max(ans, t);
            }
        }
        return ans;
    }
}