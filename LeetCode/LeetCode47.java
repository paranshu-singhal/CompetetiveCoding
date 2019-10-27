import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class LeetCode47 {

    public static void main(String[] args) {

        int[] a = {1,2,1,2};

        Set<ArrayList<Integer>> result = new HashSet<>();
        
        helper(0,a,result);

        System.out.println(new ArrayList(result));
    }

    private static void helper(int start, int[] nums, Set<ArrayList<Integer>> result){
        if(start==nums.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int num: nums){
                list.add(num);
            }
            result.add(list);
            return;
        }

        for(int i=start; i<nums.length; i++){
            
            swap(nums, i, start);
            
            helper(start+1, nums, result);
            
            swap(nums, i, start);
            
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}