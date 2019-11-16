class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        if(len==0) return 0;
        int[] profit = new int[len];
        
        int min=prices[0];
        profit[0] = 0;
        
        int max_profit = 0;
        
        for(int i=1; i<len; i++){
            min = Math.min(min, prices[i]);
            
            int cur_profit = prices[i] - min;
            if(cur_profit < profit[i-1]){
                max_profit += profit[i-1];
                profit[i] = 0;
                min = prices[i];
            } else {
                profit[i] = Math.max(cur_profit, profit[i-1]);
            }
        }
        return max_profit + profit[len-1];
    }
}