/**
 * LeetCode56
 */
import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LeetCode56 {

    public static void main(String[] args) {
        
        int[][] multi = new int[][]{
            {1,3},
            {2,6},
            {3,5},
            {15,16}
          };

        Arrays.sort(multi, (a, b) -> Double.compare(a[0], b[0]));
        //System.out.println(merge(multi));  
        List<pair> p = merge(multi);

        int[][] res = new int[p.size()][2];
        for(int i=0;i<p.size();i++){
            res[i][0] = p.get(i).a;
            res[i][1] = p.get(i).b;
        }
    }
    public static List<pair> merge(int[][] intervals) {
        
        List<pair> res = new ArrayList();
        int i=0;
        int j=0;
        int k=1;
        
        if(intervals.length == 1){
            res.add(new pair(intervals[i][0], intervals[j][1]));
            return res;
        } else if(intervals.length == 0) return res;
        
        while(k<intervals.length){
            if(intervals[j][1] < intervals[k][0]){
                res.add(new pair(intervals[i][0], intervals[j][1]));
                i=k;
                j=k;
            }
            else if(intervals[j][1] >= intervals[k][0] && intervals[j][1] < intervals[k][1]){
                j=k;
            } 
            if(k==intervals.length - 1){
                res.add(new pair(intervals[i][0], intervals[j][1]));
                break;
            }
            k++;
        }
        return res;
    }

    public static class pair{
        int a;
        int b;

        pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    
}