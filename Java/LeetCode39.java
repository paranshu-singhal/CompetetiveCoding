import java.util.List;
import java.util.ArrayList;


/**
 * LeetCode39
 */
public class LeetCode39 {

    public static void main(String[] args) {

        int target = 10;

        int[] nums = {2,3,5};
    
        List<Integer> r = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        combinationSum(nums, target, 0, r, res);

        System.out.println(res);
    }

    public static void combinationSum(int[] candidates, int target, int i, List<Integer> r, List<List<Integer>> res) {
        
        if(target < 0) return;

        if(target == 0){ 
            res.add(new ArrayList<>(r));
            return;
        }

        for(int st = i; st<candidates.length; st++){
            r.add(candidates[st]);
            combinationSum(candidates, target - candidates[st], st, r, res);
            r.remove(r.size()-1);
        }
    }
}