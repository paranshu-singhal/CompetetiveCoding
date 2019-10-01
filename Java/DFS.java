import java.util.ArrayList;
import java.util.List;

public class DFS {

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
        // edges3.add(0);
        // edges3.add(1);
        graph.add(new node(3, edges3));

        dfs(graph, 4);

    }

    public static void dfs(List<node> graph, int n) {

        List<node> stack = new ArrayList<node>();
        stack.add(graph.get(0));
        dfs_node(graph, stack);
        while(!stack.isEmpty()) dfs_node(graph, stack);
    }
    public static void dfs_node(List<node> graph, List<node> stack){

        node next_node = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        System.out.println(next_node.data);
        next_node.visited = true;

        for(int i=0;i<next_node.edges.size();i++){
            Integer edge = next_node.edges.get(i);
            node node_t = graph.get(edge);
            if(node_t.visited == false && !stack.contains(node_t)){
                stack.add(node_t);
            }
        }
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