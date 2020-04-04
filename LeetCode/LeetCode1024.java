
public class LeetCode1024 {

    public int videoStitching(int[][] clips, int T) {
        
        int[] dp = new int[T+ 1];
        Arrays.fill(dp, T+1);
        dp[0] = 0;
        for(int i = 0; i <= T; i++) {
            for(int[] c : clips) {
                if(i >= c[0] && i <= c[1]) dp[i] = Math.min(dp[i], dp[c[0]] + 1);
            }
            if(dp[i] == T+1) return -1;
        }
        return dp[T];
    }

}