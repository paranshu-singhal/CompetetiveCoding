class Solution {
    public int lastStoneWeightII(int[] stones) {
        
        int n = stones.length;
        
        List< Set<Integer> > dp = new ArrayList();
        for(int i=0; i<n; i++){
            dp.add(new HashSet());
        }
        
        dp.get(0).add(stones[0]);
        for(int i=1; i<n; i++){
            
            for(int t: dp.get(i-1)){
                dp.get(i).add(Math.abs(stones[i] - t));
                dp.get(i).add(Math.abs(stones[i] + t));
            }
        }
        
        return Collections.min(dp.get(n-1));
    }
}