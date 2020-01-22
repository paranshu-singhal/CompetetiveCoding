class Solution {
    public int maxSubArray(int[] nums) {
        
        
        int cur_max = nums[0];
        int global_max = nums[0];
        
        for(int i=1; i<nums.length; i++){
            cur_max = Math.max(nums[i], cur_max + nums[i]);
            global_max = Math.max(global_max, cur_max);
        }
        return global_max;
    }
}