class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        if(m==0 || n==0) return 1;
        
        int[][] matrix = new int[m][n];
        
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0] == 1) break;
            matrix[i][0] = 1;
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i] == 1) break;
            matrix[0][i] = 1;
        }
        
        for(int i=1; i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j] == 0){
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }
        return matrix[m-1][n-1];
    }
}