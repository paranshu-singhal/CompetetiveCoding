class Solution {
    public String pushDominoes(String dominoes) {
        
        boolean state = true;
        
        int n = dominoes.length();
        if(n==0 || n==1) return dominoes;
        
        StringBuilder build = new  StringBuilder(dominoes);
        
        while(state){
            
            state = false;
            build = new  StringBuilder(dominoes);
            
            for(int i=0; i<n; i++){
                if(dominoes.charAt(i) == '.'){
                    if(i>0 && i<n-1){
                        if(dominoes.charAt(i-1) == 'R' && dominoes.charAt(i+1) != 'L'){
                            build.replace(i, i+1, "R");
                            state = true;
                        }
                        else if(dominoes.charAt(i+1) == 'L' && dominoes.charAt(i-1) != 'R'){
                            build.replace(i, i+1, "L");
                            state = true;
                        }
                    } else if(i==0){
                        if(dominoes.charAt(i+1) == 'L') {
                            build.replace(i, i+1, "L");
                            state = true;
                        }
                    } else if(i==n-1){
                        if(dominoes.charAt(i-1) == 'R'){ 
                            build.replace(i, i+1, "R");
                            state = true;
                        }
                    }
                }
            }
            dominoes = build.toString();
        }
        return dominoes;
    }
}