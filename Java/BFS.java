import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args){

        List<node> graph = new ArrayList<node>();

        List<Integer> edges0 = new ArrayList<Integer>();
        edges0.add(1);
        edges0.add(3);
        graph.add(new node(0, edges0));

        List<Integer> edges1 = new ArrayList<Integer>();
        edges1.add(2);
        graph.add(new node(1, edges1));

        List<Integer> edges2 = new ArrayList<Integer>();
        //edges3.add(3);
        graph.add(new node(2, edges2));

        List<Integer> edges3 = new ArrayList<Integer>();
        // edges3.add(0);
        // edges3.add(1);
        graph.add(new node(3, edges3));

        bfs(graph, 4);

    }

    public static void bfs(List<node> graph, int n) {

        List<node> queue = new ArrayList<node>();
        queue.add(graph.get(0));
        bfs_node(graph, queue);
        while(!queue.isEmpty()) bfs_node(graph, queue);
    }
    public static void bfs_node(List<node> graph, List<node> queue){

        node next_node = queue.get(0);
        queue.remove(0);
        System.out.println(next_node.data);
        next_node.visited = true;

        for(int i=0;i<next_node.edges.size();i++){
            Integer edge = next_node.edges.get(i);
            node node_t = graph.get(edge);
            if(node_t.visited == false && !queue.contains(node_t)){
                queue.add(node_t);
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