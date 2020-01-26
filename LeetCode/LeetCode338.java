class Solution {
    public int[] countBits(int num) {
        
        int[] num_of_one = new int[num+1];
        
        num_of_one[0] = 0;
        if(num == 0){
            return num_of_one;
        }
        num_of_one[1] = 1;
        if(num==1){
            return num_of_one;
        }
        num_of_one[2] = 1;
        
        //k = 1;
        for(int i = 3; i<=num; i++){
            if(i%2!=0){
                num_of_one[i] = num_of_one[i-1] + 1;
            } else {
                num_of_one[i] = num_of_one[i/2];
            }
        }
        return num_of_one;
        
    }
}