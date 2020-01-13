class Solution {
    public int countSquares(int[][] matrix) {
        
        int n = matrix.length;
        if(n==0) return 0;
        
        int m = matrix[0].length;
        
        int result = 0;
        for(int i=0; i<n; i++){
            if(matrix[i][0]==1) result+=1;
        }
        for(int i=1; i<m; i++){
            if(matrix[0][i]==1) result+=1;
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j]==1){
                    matrix[i][j] = 1 + Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i][j-1]));
                    result+=matrix[i][j];
                }
                //System.out.print(matrix[i][j] + " ");
            }
            //System.out.print("\n");
        }
        return result;
    }
}