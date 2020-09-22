class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int result = 0;
        
        for(int k=0; k<points.length-1; k++) {
            
            int t1 = Math.abs(points[k+1][0]-points[k][0]);
            int t2 = Math.abs(points[k+1][1]-points[k][1]);
            
            result+=(t1 + t2 - Math.min(t1, t2));
            
        }
        return result;
        
    }
}