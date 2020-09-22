class Solution {
    public int minAddToMakeValid(String S) {
        
        // List<Integer> stack = new ArrayList();
        
        int sum = 0;
        int result = 0;
        
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                if(sum < 0) {
                   result -= sum;
                    sum=0;
                }
                sum++;
            } else {
                sum--;
            }
        }
        
        if(sum<0) result-=sum;
        else result+=sum;
        
        return result;
    }
}