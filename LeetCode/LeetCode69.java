class LeetCode69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }

    static int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        
        return binarySearch(x,1,x-1);
    }
    
    static int binarySearch(int x, int start, int end){

        if(start == end) return start;
        
        int middle = (start+end)/2;
        if(middle <= 46340){
            
            if((middle+1)*(middle+1)==x) return middle+1;
            if(middle*middle<=x && (middle+1)*(middle+1)>x) return middle;
            
            if(middle*middle<x && (middle+1)*(middle+1)<x) {
                return binarySearch(x, middle+1, end);
            }
        }
        return binarySearch(x, start, middle-1);
    }
}