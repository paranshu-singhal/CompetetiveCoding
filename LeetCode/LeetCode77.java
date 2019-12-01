class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        
        List<List<Integer>> result = new ArrayList();
        List<Integer> cur = new ArrayList();
        
        backtrack(n, k, 1, cur, 0, result);
        return result;
    }
    
    void backtrack(int n, int k, int st, List<Integer> cur, int cur_size, List<List<Integer>> result){
        
        if(cur_size == k){
            result.add(new ArrayList(cur));
            return;
        }
        
        for(int i=st; i<=n; i++){
            cur.add(i);
            cur_size ++;
            backtrack(n, k, i+1, cur, cur_size, result);
            cur.remove(cur_size-1);
            cur_size --;
        }
        
    }
}