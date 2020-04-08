
public class LeetCode740 {

    public int deleteAndEarn(int[] nums) {
        
        int n = nums.length;
        if(n==0) return 0;
        
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new ArrayList();
        
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
                list.add(nums[i]);
            }
        }
        
        int m = list.size();
        int dp[] = new int[m];
        dp[0] = list.get(0) * map.get(list.get(0));
        
        for(int i=1; i<m; i++){
            int k = list.get(i);
            
            if(i>1 && k == list.get(i-1) + 1){
                dp[i] = Math.max(dp[i-1], dp[i-2] + k * map.get(k)); 
            } else if(k == list.get(i-1) + 1){
                dp[i] = Math.max(dp[i-1] , (k * map.get(k)));
            } else {
                dp[i] = dp[i-1] + (k * map.get(k));
            }
        }
        return dp[m-1];
    }

}