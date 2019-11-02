class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        
        int x = matrix.length;
        if(x==0) return false;
        
        int y = matrix[0].length;
        if(y==0) return false;

        for(int i=0; i<x; i++){
            if(target == matrix[i][0]) return true;
            if(target == matrix[i][y-1]) return true;
            if(target < matrix[i][0]) return false;
            if(target > matrix[i][0] && target < matrix[i][y-1]){
                if(BinarySearch(matrix[i], 0, y-1, target)) return true;
            } 
        }
        return false;
    }
    
    boolean BinarySearch(int[] array, int start, int end, int target){
        
        int middle = (start+end)/2;

        if(target == array[middle]) return true;
        if(start>end || (start == end && target != array[middle])) return false;

        if(target < array[middle]) return BinarySearch(array, start, middle-1, target);
        return BinarySearch(array, middle+1, end, target);
    }
}