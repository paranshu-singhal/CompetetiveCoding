class Solution {
    public int sumFourDivisors(int[] nums) {
        int result=0;
        for(int num:nums) {
            int div1=0; int div2=0; boolean flag = true;
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num%i==0) {
                    if(div1==0 && div2==0) {
                        div1=i;
                        div2=num/i;
                    } else {
                        flag=false;
                        break;
                    }
                }
            }
            if (flag && div1!=0 && div2!=0 && div1!=div2){
                result+=(1+num+div1+div2);
            }
        }
    
        return result;
    }
}