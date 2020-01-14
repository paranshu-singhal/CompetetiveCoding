class Solution {
    
    boolean[][] visited;
    
    public int numIslands(char[][] grid) {
        int n = grid.length;
        if(n==0) return 0;
        
        int m = grid[0].length;
        
        visited = new boolean[n][m];
        
        int no_of_islands = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    no_of_islands++;
                    dfs(grid,i,j,m,n);
                }
            }
        }
        return no_of_islands;
    }
    
    void dfs(char[][] grid, int i, int j, int m, int n){
        
        if(i==n || j==m || grid[i][j]=='0' || visited[i][j]) return;
        
        visited[i][j] = true;
        
        if(i>0){
            if(!visited[i-1][j] && grid[i-1][j] == '1'){
                dfs(grid,i-1,j,m,n);
            }
        }
        
        if(j>0) {
            if(!visited[i][j-1] && grid[i][j-1] == '1'){
                dfs(grid,i,j-1,m,n);
            }
        }
        
        if(i+1<n){
            if(!visited[i+1][j] && grid[i+1][j] == '1'){
                dfs(grid,i+1,j,m,n);
            }
        }
        
        if(j+1<m) {
            if(!visited[i][j+1] && grid[i][j+1] == '1'){
                dfs(grid,i,j+1,m,n);
            }
        }
        
    }
}