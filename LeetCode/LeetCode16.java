public class LeetCode16 {

    public int threeSumClosest(int[] nums, int target) {
        
        int size = nums.length;
        if(size == 0) return 0;
        
        int ans = 0;
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0;i<size-1;i++){
            
            int st = i+1;
            int en = size-1;
            
            while(st<en){
                int sum = nums[i] + nums[st] + nums[en];
                if(Math.abs(target - sum) < closest){
                    closest = Math.abs(target - sum);
                    ans = sum;
                    //st++; //en--;
                } 
                if(sum < target){
                    st++;
                } else {
                    en--;
                }
            }
        }
        return ans;
    }
    
}

