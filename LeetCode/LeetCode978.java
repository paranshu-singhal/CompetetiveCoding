class Solution {
    public int maxTurbulenceSize(int[] A) {
        
        int n = A.length;
        if(n==0) return 0;
        if(n==1) return 1;
        //if(n==2) return 2;
        
        int sign;
        int dp;
        int res = Integer.MIN_VALUE;
        
        if (A[0] > A[1]){sign = -1; dp = 2;} 
        else if(A[0] == A[1]){ sign = 0; dp = 1;}
        else { sign = 1; dp = 2;}
        
        for(int i=2; i<n; i++){
            if(A[i] > A[i-1]){
                if(sign == -1 || sign == 0){
                    dp++;
                } else {
                    dp = 2;
                }
                sign = 1;
            } 
               
            else if(A[i] < A[i-1]){
                if(sign == 1 || sign == 0){
                    dp++;
                } else {
                    dp = 2;
                }
                sign = -1;
            } else {
                sign = 0; dp = 1;
            }
            res = Math.max(res, dp);
        }
        res = Math.max(res, dp);
        return res;
    }
}