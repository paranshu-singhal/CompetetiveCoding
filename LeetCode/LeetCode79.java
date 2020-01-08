class Solution {
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        if(m==0) return false;
        int n = board[0].length;
        
        if(word.length() == 0) return false;
        
        boolean[][] vis = new boolean[m][n];
        
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(backtrack(board, word, i, j, 0, vis)) return true;
            }
        }
        return false;
    }
    
    boolean backtrack(char[][] board, String word, int i, int j, int cur, boolean[][] vis){
        
        if(i<0 || j<0 || i>=board.length || j>=board[0].length) return false;
        if(vis[i][j]) return false;
        
        if(board[i][j] != word.charAt(cur)) return false;
        if(board[i][j] == word.charAt(cur) && cur == word.length() - 1) return true;
        
        vis[i][j] = true;
        //System.out.println("i: "+ i + " j: "+j);
        
        boolean result = backtrack(board, word, i-1, j, cur+1, vis) ||
                         backtrack(board, word, i, j-1, cur+1, vis) ||
                         backtrack(board, word, i+1, j, cur+1, vis) ||
                         backtrack(board, word, i, j+1, cur+1, vis);
        
        vis[i][j] = false;
        
        return result;
            
        
    }
    
    
}