class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> cur = new ArrayList();
        List<List<Integer>> result = new ArrayList();
        
        backtrack(nums,0,cur,result);
        return result;
        
    }
    
    void backtrack(int[] nums, int st, List<Integer> cur, List<List<Integer>> result){
        
        result.add(new ArrayList(cur));
        
        for(int i=st; i<nums.length; i++){
            cur.add(nums[i]);
            backtrack(nums, i+1, cur, result);
            cur.remove(cur.size()-1);
        }
    }
}