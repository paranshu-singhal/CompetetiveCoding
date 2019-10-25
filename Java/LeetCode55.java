/**
 * LeetCode55
 */
public class LeetCode55 {

    public static void main(String[] args) {
        
        int nums[] = {3,2,1,0,4};

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        
        int last = nums.length -1;
        
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] + i >= last){
                last = i;
            }
        }
        return last==0;
    }
}