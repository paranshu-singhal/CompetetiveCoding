class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n = arr.length;
        int[][] dp = new int[n][n];
        
        for(int k=0;k<arr.length;k++){
            int i=0; int j=k;
            while(i<n-k){
                if(i==j){
                    dp[i][j]=arr[i];
                } else {
                    dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
                }
                i++;
                j++;
            }
        }
        int sum=0;
        for(int k=0;k<n;k+=2) {
            int i=0, j=k;
            while(j<n){
                sum+=dp[i][j];
                i++;
                j++;
            }
        }
        return sum;
    }
}