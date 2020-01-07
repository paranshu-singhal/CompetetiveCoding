class Solution {
    public int removeElement(int[] nums, int val) {
        
        int start = 0, end = 0;
        
        while(end < nums.length){
            if(nums[start] == val && nums[end] == val){
                end++;
            } else if(nums[start] != val && nums[end] != val){
                start++; end++;
            } else if(nums[start] == val && nums[end] != val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end++;
            } else {
                start++; end++;
            }
            
        }
        return start;
        
    }
}