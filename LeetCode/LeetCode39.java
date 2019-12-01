class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList();
        List<Integer> curList = new ArrayList();
        
        
        backtrack(candidates, target, 0, 0,curList, result);
        return result;
    }
    
    void backtrack(int[] candidates, int target, int sum, int st, List<Integer> curList, List<List<Integer>> result){
        
        if( sum > target) return;
        
        if(sum == target) {
            result.add(new ArrayList(curList));
            return;
        }
        
        for(int i=st; i<candidates.length; i++){
            
            curList.add(candidates[i]);
            backtrack(candidates, target, sum + candidates[i], i, curList, result);
            curList.remove(curList.size()-1);
        }
    }
}