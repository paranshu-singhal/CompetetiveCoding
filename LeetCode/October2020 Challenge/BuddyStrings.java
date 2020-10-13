class Solution {
    public boolean buddyStrings(String A, String B) {
        
        List<Integer> diff = new ArrayList();
        if(A.length()!=B.length()) return false;
        
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=B.charAt(i)) {
                diff.add(i);
            }
        }
        
        if(diff.size()!=0 && diff.size()!=2){
            return false;
        }
        
        if(diff.size()==0) {
            
            int[] hash = new int[26];
            for(int i=0;i<A.length();i++) {
                hash[A.charAt(i) - 'a']++;
                if(hash[A.charAt(i) - 'a'] >1) return true;
            }
            return false;
            
        } else if (diff.size()==2) {
            if(A.charAt(diff.get(0))==B.charAt(diff.get(1)) && A.charAt(diff.get(1))==B.charAt(diff.get(0))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}