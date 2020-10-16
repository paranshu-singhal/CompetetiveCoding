class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0) return false;
        if(matrix.length==1) {
            return binarysearch(matrix[0], 0, matrix[0].length-1, target);
        }
        
        for(int i=0; i<matrix.length;i++) {
            if(matrix[i].length>0) {
                if(matrix[i][0]==target) return true;
                if(i+1<matrix.length && matrix[i+1][0]==target) return true;
                if(target > matrix[i][0] && i==matrix.length-1) {
                    return binarysearch(matrix[i], 0, matrix[i].length-1, target);
                }
                else if(target > matrix[i][0] && target < matrix[i+1][0]) {
                    return binarysearch(matrix[i], 0, matrix[i].length-1, target);
                }
            }
            else return false;
        }
        return false;
    }
    
    boolean binarysearch(int[] arr, int l, int r, int target){
        
        if(l<=r) {
            int mid=(l+r)/2;

            if(arr[mid]==target) return true;

            if(target<arr[mid]) return binarysearch(arr, l, mid-1, target);

            return binarysearch(arr, mid+1, r, target);
        } 
        return false;
    }
}