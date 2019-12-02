class Solution {
    public int numSquares(int n) {
        
//         List<Integer> squares = new ArrayList();
        
//         int i=1;
//         while((i*i)<=n){
//             squares.add((i*i));
//             i++;
//         }
        
        int[] dp = new int[n+1];
        
        // for(i=1;i<=n;i++){
        //     dp[i] = Integer.MAX_VALUE;
        //     for(int j=0;j<squares.size();j++){
        //         if(i-squares.get(j) >=0){
        //             dp[i] = Math.min(dp[i], dp[i-squares.get(j)] + 1);
        //         }
        //     }
        // }
        
        for(int i=1; i<=n;i++){
            dp[i] = Integer.MAX_VALUE;
            
            for(int j=1; j<=Math.sqrt(i);j++){
                dp[i] = Math.min(dp[i], dp[i-(j*j)] + 1);
            }
        }
        return dp[n];
        
    }
}