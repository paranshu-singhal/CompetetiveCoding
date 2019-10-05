import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Dijkstra {

    public static void main(String[] args){

        List<node> graph = new ArrayList<node>();

        List<Pair> edges0 = new ArrayList<Pair>();
        edges0.add(new Pair(2,6));
        edges0.add(new Pair(3,6));
        graph.add(new node(Integer.MAX_VALUE, edges0));

        List<Pair> edges1 = new ArrayList<Pair>();
        edges1.add(new Pair(0,3));
        graph.add(new node(Integer.MAX_VALUE, edges1));

        List<Pair> edges2 = new ArrayList<Pair>();
        edges2.add(new Pair(3,2));
        graph.add(new node(Integer.MAX_VALUE, edges2));

        List<Pair> edges3 = new ArrayList<Pair>();
        edges3.add(new Pair(2,1));
        graph.add(new node(Integer.MAX_VALUE, edges3));

        List<Pair> edges4 = new ArrayList<Pair>();
        edges4.add(new Pair(1,4));
        edges4.add(new Pair(3,1));
        graph.add(new node(0, edges4));

        findShortestPath(graph);

        for(int i=0;i<graph.size();i++) System.out.println(graph.get(i).distance);

    }

    public static void findShortestPath(List<node> graph){

        PriorityQueue<node>  pq = new PriorityQueue<node>(new comparator());
        for(int i=0;i<graph.size();i++) pq.add(graph.get(i));

        while(!pq.isEmpty()){
            node n1 = pq.poll();
            for(int i=0;i<n1.edges.size();i++){
                Pair p = n1.edges.get(i);
                node n2 = graph.get(p.getVertex());
                if(n2.distance > n1.distance + p.getWeight()){
                    n2.distance = n1.distance + p.getWeight();
                }
            }
        }
    }

    public static class node {
        int distance;
        List<Pair> edges;
        boolean visited = false;
    
        node(int distance, List<Pair> edges){
            this.distance = distance;
            this.edges = edges;
        }
    }

    public static class comparator implements Comparator<node>{
        public int compare(node n1, node n2){
            return (n1.distance - n2.distance);
        } 
    }

    public static class Pair{
        int vertex;
        int weight;

        Pair(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }

        int getVertex(){ 
            return vertex; 
        } 
        int getWeight(){
            return weight;
        } 
    }
}

