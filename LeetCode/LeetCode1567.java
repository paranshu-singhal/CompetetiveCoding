class Solution {
    public int getMaxLen(int[] nums) {
        
        int len = nums.length;
        int result = Integer.MIN_VALUE;
        int start=0; int end=0;
        while(end < len) {
            while(nums[end]!=0) {
                end++;
                if(end == len) break;
            }
            result = Math.max(result, helper(nums, start, end-1));
            if (end == len-1) return result;
            else {
                start = end+1;
                end++;
            }
        }
        return result;
    }
    
    public int helper(int[] nums, int start, int end) {
        
        int num = 0;
        
        for(int i=start; i<=end; i++) {
            if(nums[i] < 0) num++;
        }
        if(num%2==0) {
            return end-start+1;
        }
        else {
            int i=start, j=end;
            while(nums[i] > 0) i++;
            while(nums[j] > 0) j--;
            
            return Math.max(j-start, end-i);
        }
    }
}