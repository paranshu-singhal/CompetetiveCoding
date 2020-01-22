class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        if(len == 0 || len == 1) return 0;

        // int[] buy = new int[len];
        // int[] sell = new int[len];
        
        int s2 = 0;
        int s1 = 0;
        int b1 = -prices[0];
        
        int b0, s0;
            
        // sell[0] = 0;
        // buy[0] = 0 - prices[0];
        
        // buy[1] = Math.max(buy[0], 0-prices[1]);
        // sell[1] = Math.max(sell[0], buy[0]+prices[1]);
        
        for(int i=1; i<len; i++){
            b1 = Math.max(b1, s2 - prices[i]);
            s0 = Math.max(s1, b1 + prices[i]);
            
            //b1 = b0;
            s2 = s1;
            s1 = s0;
            
        }
        
        return s1;
    }
}