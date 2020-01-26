class Solution {
    
    int[] res = new int[59];
    
    public int integerBreak(int n) {
        
        res[1] = 1;
        res[2] = 1;
        res[3] = 2;
        res[4] = 4;
        res[5] = 6;
        res[6] = 9;

        for(int i=7; i<=58; i++){
           res[i] = Math.max(res[i-2] * 2, res[i-3] * 3);
        }
        return res[n];
        
    }
}