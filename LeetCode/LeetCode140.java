import java.util.*;

class LeetCode140 {
    
    public static void main(String[] args){
        String s = "catsanddog";
        //["","pen","applepen","pine","pineapple"]
        List<String> wordDict = new ArrayList();

        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        wordBreak(s, wordDict);
    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
            
        List<String> result = new ArrayList();
        //StringBuilder sb = new StringBuilder();
        helper(s, wordDict, 0, "", result);
        return result;
        
    }

    static void helper(String s, List<String> wordDict, int start, String current_s, List<String> result){
        
        for(String w: wordDict){
            
            int end = start+w.length();
            if(end > s.length()) continue;
            if(end == s.length() && s.substring(start, end).equals(w)){
                current_s = current_s + s.substring(start, end);
                //current_s.append(s.substring(start, end));
                result.add(current_s.toString());
                return;
            } 
            
            if(s.substring(start, end).equals(w)){
                current_s = current_s + (s.substring(start, end) + " ");
                //current_s.append(s.substring(start, end) + " ");
                helper(s, wordDict, end, current_s, result);
                System.out.println(s.substring(start, end));
                current_s = current_s.replaceAll((s.substring(start, end) + " "), "");
            }
        }
        
    }
}