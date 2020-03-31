class Solution {
    public int minHeightShelves(int[][] books, int shelf_width) {
        
        int len = books.length;
        
        int[] dp = new int[len];
        
        for(int i=0; i<len; i++){
            
            if(i==0) { 
                dp[i] = books[i][1]; 
                continue; 
            }
            
            dp[i] = dp[i-1] + books[i][1];
            
            int w = books[i][0];
            
            int max_h = books[i][1];
            
            for(int j=i-1; j>=0; j--){
                w += books[j][0];
                if( w <= shelf_width){
                    max_h = Math.max(max_h, books[j][1]);
                    dp[i] = (j>0)?Math.min(dp[i], dp[j-1] + max_h) : Math.min(dp[i], max_h);
                    
                } else break;
            }
        }
        return dp[len-1];
    }
}