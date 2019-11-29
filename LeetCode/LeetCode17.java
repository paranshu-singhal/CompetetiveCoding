class Solution {
    public List<String> letterCombinations(String digits) {
        
        HashMap<Integer, String> map = new HashMap();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        
        List<String> result = new ArrayList();
        String str="";
       
        if(digits.length()==0) return result;
        
        helper(digits, str, 0, map, result);
        return result;
    }
    
    void helper(String digits, String str, int cur, HashMap<Integer, String> map, List<String> result){
        
        if(str.length() == digits.length()){
            result.add(str);
            return;
        } 

        int digit = Integer.parseInt(digits.substring(cur,cur+1));
        
        for(int i=0; i < map.get(digit).length(); i++){
            helper(digits, str + map.get(digit).charAt(i), cur+1, map, result);
        }
        
    }
}