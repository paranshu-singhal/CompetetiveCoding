class Solution {
    public int maxProduct(int[] nums) {
        
        int len = nums.length;
        
        int[] max = new int[len];
        int[] min = new int[len];
        
        max[0] = min[0] = nums[0];
        
        int result = max[0];
        
        for(int i=1;i<len;i++){
            
            if(nums[i] > 0){
                max[i] = Math.max(nums[i], nums[i] * max[i-1]);
                min[i] = Math.min(nums[i], nums[i] * min[i-1]);
            } else {
                max[i] = Math.max(nums[i], nums[i] * min[i-1]);
                min[i] = Math.min(nums[i], nums[i] * max[i-1]);
            }
            result = Math.max(result,max[i]);
        }
        return result;
    }
}