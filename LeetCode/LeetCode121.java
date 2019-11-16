class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        if(len==0) return 0;
        int[] profit = new int[len];
        
        int min=prices[0];
        profit[0] = 0;
        
        for(int i=1; i<len; i++){
            min = Math.min(prices[i],min);
            profit[i] = Math.max(profit[i-1],prices[i] - min);
        }
        return profit[len-1];
        
    }
}