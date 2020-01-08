class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> result = new HashSet();
        
        int m = board.length;
        if(m==0) new ArrayList(result);
        int n = board[0].length;
        
        //if(word.length() == 0) return resulr;
        
        for(int k=0; k<words.length; k++){
            boolean[][] vis = new boolean[m][n];
            boolean flag = false;
            
            for(int i=m-1; i>=0; i--){
                for(int j=n-1; j>=0; j--){
                    if(backtrack(board, words[k], i, j, 0, vis)){
                        result.add(words[k]);
                        flag = true;
                        break;
                    } 
                    if(flag) break;
                }
            }
        
        }
        
        return new ArrayList(result);
        
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