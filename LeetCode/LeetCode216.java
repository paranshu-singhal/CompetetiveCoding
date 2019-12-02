class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<Integer> cur = new ArrayList();
        List<List<Integer>> result = new ArrayList();
        
        backtrack(n,k,0,1,cur,result);
        return result;
        
    }
    
    void backtrack(int n, int k, int sum, int st, List<Integer> cur, List<List<Integer>> result){
        
        if(cur.size() > k || sum>n) return;
        
        if(cur.size() == k){
            if(sum == n){ 
                result.add(new ArrayList(cur)); 
            } 
            return;
        }
        
        for(int i=st; i<=9; i++){
            cur.add(i);
            backtrack(n,k,sum + i, i+1,cur,result);
            cur.remove(cur.size()-1);
        }
        
        
    }
}