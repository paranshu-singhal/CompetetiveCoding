import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

    public static void main(String[] args){
        
        List<Integer> data = new ArrayList<Integer>();
        data.add(5); data.add(1); data.add(2); data.add(9); data.add(6); // data = [5,1,2,9,6]

        List<node> nodes = createSets(data);
        union(2,1, nodes);
        //union(6,9, nodes);
        union(5,6, nodes);

        //sets - [1,2], [5,6], [9]
        
        System.out.println(find_parent(5, nodes) == find_parent(1, nodes));
        System.out.println(find_parent(1, nodes) == find_parent(2, nodes));
        System.out.println(find_parent(5, nodes) == find_parent(9, nodes));
  
        union(1,6, nodes);
        //sets - [5,1,2,6] ,[9]

        System.out.println(find_parent(2, nodes) == find_parent(9, nodes));

        union(9,6, nodes);
        //sets - [5,1,2,6,9]

        System.out.println(find_parent(5, nodes) == find_parent(9, nodes));
    } 
    
    public static List<node> createSets(List<Integer> data){
        
        ArrayList<node> nodes = new ArrayList<node>();
        for(int i=0;i<20;i++) nodes.add(null);
        
        for(int i=0;i<data.size();i++){
            int d = data.get(i);
            nodes.set(d, new node(d));
        }
        return nodes;
    }

    //union by rank method
    public static void union(int d1, int d2, List<node> nodes){ 
        node n1 = find_parent(d1, nodes);
        node n2 = find_parent(d2, nodes);
        if(n1 == n2) return;

        if(n1.rank > n2.rank){
            n2.parent = n1;
        } else if(n1.rank < n2.rank){
            n1.parent = n2;
        } else {
            n2.parent = n1;
            n1.rank++;
        }
    }

    public static node find_parent(int d1, List<node> nodes){
        node n = nodes.get(d1);
        while(n.parent != n){
            n = n.parent;
        }
        nodes.get(d1).parent = n; //caching mechanism to speed up the find_parent operation
        return n;
    }

    public static class node{
        int data;
        node parent;
        int rank;

        node(int data){
            this.data = data;
            this.parent = this;
            this.rank = 0;
        }
    }          
}