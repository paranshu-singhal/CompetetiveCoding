
public class LeetCode1218 {
    public int longestSubsequence(int[] arr, int difference) {
        
        int n = arr.length;
        if(n==1) return 1;
        
        Map<Integer, Integer> dp = new HashMap();
        
        int res = Integer.MIN_VALUE;
        
        for(int a: arr){
            
            int t = dp.getOrDefault(a - difference, 0) + 1;
            dp.put(a, t);
            if(res < t) res = t;
            
        }
        
        return res;
    }
}