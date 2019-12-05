class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0;
        
        
        for(int j=1; j<nums.length; j++){
            if(nums[i]==0 && nums[j]!=0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
            if(nums[i]!=0) i++;
        }
        
        // for(i=0; i<nums.length;i++){
        //     System.out.print(nums[i] + " ");
        // }
    }
}