class Solution {
    public int minSetSize(int[] arr) {
        
        int n = arr.length;
        int[] map = new int[100005];
        
        for(int i=0; i<n; i++) {
            map[arr[i]]++;
        }
        
        Arrays.sort(map);
        
        int result = 0;
        
        for(int i=map.length-1; i>=0; i--) {
            if(n > arr.length/2) {
                result++;
                n-=map[i];
            } else {
                break;
            }
        }
        
        return result;
        
    }
}