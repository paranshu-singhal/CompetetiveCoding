class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        int n = nums.length;
        
        if(n==0) return 0;
        if(n==1) return 1;
        
        int pos = 1;
        int neg = 1;
        
        int res = Integer.MIN_VALUE;
        
        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                pos = neg + 1;
            } else if(nums[i] < nums[i-1]){
                neg = pos + 1;
            }
            
            if(res < pos) res = pos;
            if(res < neg) res = neg;
        }
        return res;
    }
}