class Solution {
    public void rotate(int[] nums, int k) {
        
        k=k%(nums.length);
        
        nums = reverse(nums, 0, nums.length-1);
             
        nums = reverse(nums, 0, k-1);
        nums = reverse(nums, k, nums.length-1);
        
    }
    int[] reverse(int[] nums, int i, int j){
        while(i<j) {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
        return nums;
    }
}