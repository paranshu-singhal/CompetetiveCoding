class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int win = n - k - 1;

        int i=0, j=i+win;

        int total_points = 0;
        for(int s: cardPoints) total_points+=s;
        if(win<0) return total_points;

        int win_points = 0;
        for(int s=0; s<=j; s++) win_points+=cardPoints[s];

        int res = Integer.MIN_VALUE;

        while(j < n){
            res = Math.max(res, total_points - win_points);
            j++;
            if(j < n) win_points += cardPoints[j];
            win_points -= cardPoints[i];
            i++;
        }

        return res;
    }
}