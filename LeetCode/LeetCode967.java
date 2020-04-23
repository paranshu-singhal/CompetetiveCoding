class Solution {
    
    List<Integer> list = new ArrayList();
    
    public int[] numsSameConsecDiff(int N, int K) {
        
        for(int i=1; i<10; i++) helper(N,K,1,i);
        if(N==1) list.add(0);
        int[] res = list.stream().mapToInt(i -> i).toArray();
        return res;
    }
    
    void helper(int n, int k, int cur_n, int cur_num){
        
        if(cur_n > n) return;
        if(cur_n == n){
            list.add(cur_num);
            return;
        }
        
        int last_digit = cur_num%10;
        
        if(last_digit + k <10){ 
            cur_num = cur_num*10 + last_digit + k;
            helper(n, k, cur_n+1, cur_num);
            cur_num/=10;
        }
        
        if(last_digit - k >= 0 && k!=0){ 
            cur_num = cur_num*10 + (last_digit - k);
            helper(n, k, cur_n+1, cur_num);
        }
        
    }
}