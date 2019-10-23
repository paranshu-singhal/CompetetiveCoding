/**
 * LeetCode34
 */
public class LeetCode34 {

    public static void main(String[] args) {

        int[] nums = new int[args.length];

        for(int i=0;i<args.length;i++){
            nums[i] = Integer.parseInt(args[i]);
        }
       
        int target = 8;

        int[] ans = {-1, -1};
        int lo = BinarySearch(nums, target, true);
        int hi = BinarySearch(nums, target, false) - 1;
        
        if(lo == nums.length || nums[lo]!=target) System.out.println(-1);
        else {
            ans[0] = lo;
            ans[1] = hi;
        }
        System.out.println(ans);

    }

    public static int BinarySearch(int[] nums, int target, Boolean left){

        
        
        int lo = 0;
        int hi = nums.length - 1;

        while(lo<hi){
            int mid = (lo+hi)/2;
            if(nums[mid] > target || (left && nums[mid] == target))  hi = mid;
            else {
                lo = mid+1;
            }
        }
        return lo;
    }
}