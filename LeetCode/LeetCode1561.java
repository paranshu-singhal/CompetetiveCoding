class Solution {
    public int maxCoins(int[] piles) {
        
        int n = piles.length;
        Arrays.sort(piles);
        int k=n-2;
        int result=0;
        for(int i=0; i<n/3; i++) {
            result+=piles[k];
            k-=2;
        }
        return result;
    }
}