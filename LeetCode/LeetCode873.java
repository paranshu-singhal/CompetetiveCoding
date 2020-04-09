class Solution {
    public int lenLongestFibSubseq(int[] A) {
        
        int n = A.length;
        
        Map<Integer, Integer> index = new HashMap();
        for(int i=0; i<n; i++) index.put(A[i], i);
        
        int ans = Integer.MIN_VALUE;
        Map<Integer, Integer> longest = new HashMap();
        
        for(int k=1; k<n; k++){
            for(int j=0; j<k; j++){
                
                int i = index.getOrDefault(A[k] - A[j], -1);
                if(i>=0 && i < j){
                   int t = longest.getOrDefault(i*n + j, 2) + 1;
                   longest.put(j*n + k, t);
                   ans = Math.max(ans, t); 
                }
            }
        }
        return ans >= 3 ? ans : 0;
    }
}