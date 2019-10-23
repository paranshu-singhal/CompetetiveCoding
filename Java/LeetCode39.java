import java.util.List;
import java.util.ArrayList;


/**
 * LeetCode39
 */
public class LeetCode39 {

    public static void main(String[] args) {

        int target = 8;

        int[] nums = {2,3,5};
    
        List<Integer> r = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        combinationSum(nums, 8, 0, r, res);

        System.out.println(res);
    }

    public static void combinationSum(int[] candidates, int target, int i, List<Integer> r, List<List<Integer>> res) {
        
        if(target<0) return;

        if(target==0){
            res.add(r);
            return;
        }

        while(i<candidates.length && target - candidates[i]>=0){

            r.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i,r, res);
            i++;
            r.remove(r.size()-1);
        }
    }
}