class Solution {
    public String removeDuplicateLetters(String s) {
        
        
        int[] hashmap = new int[26];
        boolean[] vis = new boolean[26];
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            hashmap[s.charAt(i) - 'a']=i;
        }
        for(int i=0;i<s.length();i++){
            
            int ch = s.charAt(i)-'a';
            if(vis[ch]) continue;
            
            while(!stack.isEmpty() && stack.peek()>ch && hashmap[stack.peek()] > i) {
                vis[stack.peek()] = false;
                stack.pop();
            }
            vis[ch] = true;
            stack.push(ch);
            
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append((char)(stack.pop() + 'a'));
        }
        return result.reverse().toString();
    }
}