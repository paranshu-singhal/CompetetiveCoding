class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        
        List<Boolean> list = new ArrayList();
        
        int result = 0;
        int l = 1;
        int n=num;
        
        while(n>0) {
            n=n/2;
            result+=l;
            l*=2;
        }
        
        return result-num;
    }
}