class LeetCode80 {
    
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,1,2,3,3};
        int i = removeDuplicates(nums);
        System.out.println(nums);
    }

    public static int removeDuplicates(int[] nums) {
        
        if(nums.length==0) return 0;
        
        int i=0;
        int count=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                count=0;
            } else {
                if(count < 1) i++;
                count++;
            }
        }
        return i+1;
    }
}