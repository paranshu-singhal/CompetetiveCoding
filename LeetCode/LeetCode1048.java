public class LeetCode1048 {
    public int longestStrChain(String[] words) {
        
        Arrays.sort(words, (a,b)-> a.length() - b.length());
        
        Map<String, Integer> hash = new HashMap();
        
        for(int i = 0; i<words.length; i++){
            
            if(hash.containsKey(words[i])) continue;
            
            hash.put(words[i], 1);
            
            if(words[i].length()>1){
            
                for(int j=0; j<words[i].length(); j++){

                    String t = words[i].substring(0, j).concat(words[i].substring(j+1));
                    if(hash.containsKey(t)){
                        if(hash.get(t)+1 > hash.get(words[i])){
                            hash.put(words[i], hash.get(t)+1);
                        }   
                    }
                }
            }
        }
        
        int ans = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : hash.entrySet()){
            ans = Math.max(ans, entry.getValue());
        }
        return ans;
    }
}