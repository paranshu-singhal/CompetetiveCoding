
public class LeetCode646 {

        public int findLongestChain(int[][] pairs) {
            
            int n = pairs.length;
            if(n==0) return 0;
            if(n==1) return 1;
            
            //int[] dp = new int[n];
            
            Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
            
            //System.out.println(pairs[0][0] + " " + pairs[0][1]);
            
            //int ans = 0;
            
            int cur = Integer.MIN_VALUE, ans = 0;
            
            for(int i=0; i<n; i++){
                // for(int j=0; j<i; j++){
                //     if(pairs[i][0]>pairs[j][1]){
                //         dp[i] = Math.max(dp[i], dp[j] + 1);
                //     }
                // }
                // ans = Math.max(ans, dp[i]);
                if(pairs[i][0] > cur){
                    cur = pairs[i][1];
                    ans++;
                }
            }
            //return dp[n-1]+1;
            
            //for(int i=0; i<n;i++) System.out.print(dp[i] + " ");
            return ans;
        }
}