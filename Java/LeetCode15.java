/**
 * LeetCode15
 */
public class LeetCode15 {

    public static void main(String[] args) {
        
    }

    public List<List<Integer>> threeSum(int[] nums) {
        
        int i=0; int j=0; int k = nums.length;

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<LArrayListist<Integer>>();
        if(nums.length==0) return ans;

        while(i<j){
            
            int sum = nums[i] + nums[j] + nums[k];
            if(sum<0){
                j++;
                if(j==k){
                    i++; j=i+1;
                }
            } else if(sum>0){
                k--; 
                if(j==k){
                    j=i+1;
                }
                // j=i+1;
            } else {
                List<Integer> temp = new List<Integer>();
                temp.add(nums[i]);temp.add(nums[j]);temp.add(nums[k]);
                if(ans.indexOf(temp)==-1){
                    ans.add(temp);
                }
                ans.add(temp);
            }
        }
        
        
    }
}