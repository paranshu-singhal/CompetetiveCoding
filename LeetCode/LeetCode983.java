class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        int[] dp = new int[days[days.length-1]+1];
        
        for(int i=1; i<dp.length; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        
        boolean[] hash = new boolean[days[days.length-1]+1];
        
        int[] hash2 = {1,7,30};
        
        for(int j=0; j<days.length; j++){
            hash[days[j]]=true;
        }
        
        for(int j=1; j<dp.length; j++){
                
            for(int i=0; i<3; i++){
                
                if(hash[j]){
                    if(j-hash2[i]>=0)   dp[j] = Math.min(dp[j], dp[j-hash2[i]] + costs[i]);
                    else dp[j] = Math.min(dp[j], costs[i]);
                } else {
                    dp[j] = dp[j-1];
                }
            }
        }
        
        return dp[dp.length-1];
    }
}