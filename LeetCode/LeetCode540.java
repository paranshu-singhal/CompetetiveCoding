class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        return search(nums, 0, nums.length-1);
        
    }
    
    public int search(int[] nums, int start, int end) {
        
        if(start == end) return nums[start];
        
        int mid = (start + end) /2;
        
        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
        
        if(nums[mid]==nums[mid-1]) {
            if((mid-start)%2==0) {
                return search(nums, start, mid-2);
            } else {
                return search(nums, mid+1, end);
            }
        } else {
            if((end-mid)%2==0) {
                return search(nums, mid+2, end);
            } else {
                return search(nums, start, mid-1);
            }
                
        }
    }
}