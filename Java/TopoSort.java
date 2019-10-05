import java.util.List;
import java.util.ArrayList;

public class TopoSort {

    public static void main(String[] args){

        List<node> graph = new ArrayList<node>();

        List<Integer> edges0 = new ArrayList<Integer>();
        edges0.add(1);
        edges0.add(2);
        graph.add(new node(0, edges0));

        List<Integer> edges1 = new ArrayList<Integer>();
        //edges1.add(2);
        graph.add(new node(1, edges1));

        List<Integer> edges2 = new ArrayList<Integer>();
        edges2.add(3);
        graph.add(new node(2, edges2));

        List<Integer> edges3 = new ArrayList<Integer>();
        edges3.add(1);
        // edges3.add(1);
        graph.add(new node(3, edges3));

        TopologicalSort(graph, 4);

    }

    public static void TopologicalSort(List<node> graph, int n){

        List<node> stack = new ArrayList<node>();

        for(int i=0;i<n;i++){
            if(graph.get(i).visited == false) TopologicalVisit(graph, graph.get(i), stack);
        }

        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(stack.size()-1-i).data);
        }
    }

    public static void TopologicalVisit(List<node> graph, node currNode, List<node> stack){
        
        List<Integer> edges = currNode.edges;
        if(edges.size()>0){
            for(int i=0;i<edges.size();i++){
                node node_t = graph.get(edges.get(i));
                if(node_t.visited == false){
                    TopologicalVisit(graph, node_t, stack);
                }
            }
        } 
        currNode.visited = true;
        stack.add(currNode);
    } 

    public static class node {
        int data;
        List<Integer> edges;
        boolean visited = false;

        node(int data, List<Integer> edges){
            this.data = data;
            this.edges = edges;
        }
    }
}