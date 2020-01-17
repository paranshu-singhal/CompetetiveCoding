import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        int[] res = new int[2];
        int size = edges.length;
        
        DSU dsu = new DSU(size);
        
        for(int i=0;i < size; i++){
            // int p1 = dsu.find(edges[i][0]-1);
            // int p2 = dsu.find(edges[i][1]-1);
            
            if(!dsu.union(edges[i][0]-1, edges[i][1]-1)){ 
                return edges[i];
            } 
        }
        return res;
    }
    
    class DSU {
        
        List<Integer> parent;
        List<Integer> rank;

        DSU(int n){
            parent = new ArrayList<Integer>();
            rank = new ArrayList<Integer>();
            for(int i=0; i<n; i++){
                parent.add(i);
                rank.add(0);
            }
        }

        int find(int x){
            if(parent.get(x)!=x){
                parent.set(x, find(parent.get(x)));
            }
            return parent.get(x);
        } 

        boolean union(int x, int y){
            int p1 = find(x);
            int p2 = find(y);

            if(p1==p2) return false;

            if(rank.get(p1)<rank.get(p2)){
                int t=p1;
                p1=p2;
                p2=t;
            }

            if (rank.get(p1)==rank.get(p2)){
                rank.set(p1, rank.get(p1)+1);
            }

            parent.set(p2, p1);
            return true;
        }
    }
}