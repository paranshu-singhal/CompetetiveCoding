class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        
        int len = A.length;
        int sum = 0;
        
        for(int i=0;i<len;i++) sum += A[i];
        
        if(sum%3 != 0) return false;
        
        int target = sum/3;
        
        sum=0;
        int cnt=0;
        for(int i=0;i<len;i++){
            sum+=A[i];
            if(sum==target){
                sum=0;
                cnt++;
            }
            if(i==len-1){
                if(cnt==3) return true;
            }
        }
        return false;
        
    }
}