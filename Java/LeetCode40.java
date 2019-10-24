import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode40 {

    public static void main(String[] args) {
        
        int target = 4;
        int[] candidates = {1,1,2,2};

        Arrays.sort(candidates);
    
        List<Integer> curr = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        helper(res, curr, 0, target, candidates);

        System.out.println(res);
    }

    public static void helper(List<List<Integer>> result, List<Integer> curr, int start, int target, int[] candidates){
        if(target==0){
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        if(target<0){
            return;
        }
     
        int prev=-1;
        for(int i=start; i<candidates.length; i++){
            if(prev!=candidates[i]){ 
                curr.add(candidates[i]);
                helper(result, curr, i+1, target-candidates[i], candidates);
                curr.remove(curr.size()-1);
                prev=candidates[i];
            }
        }
    }
}