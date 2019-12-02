class Solution {
    public int peakIndexInMountainArray(int[] A) {
        
        int l = 0;
        int r = A.length -1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(A[mid]>A[mid-1] && A[mid]>A[mid+1]) return mid;
            
            if (A[mid]>A[mid-1] && A[mid]<A[mid+1]) l=mid+1;
            
            else if (A[mid]<A[mid-1] && A[mid]>A[mid+1]) r = mid-1;
        }
        return 0;
    }
}