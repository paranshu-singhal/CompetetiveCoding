import java.util.Arrays;

public class FloydWarshall {

    public static void main(String[] args){
        
        int size = 4;
        int[][] graph = new int[size][size];

        graph[0][1] = 8;
        graph[1][2] = 1;
        graph[3][2] = 9;
        graph[0][3] = 1;
        graph[3][1] = 2;
        graph[2][0] = 4;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(graph[i][j] == 0) graph[i][j] = Integer.MAX_VALUE;
            }
        }

        graph[0][0] = 0;
        graph[1][1] = 0;
        graph[2][2] = 0;
        graph[3][3] = 0;

        FloydWarshallAlgo(graph, size);

    }

    public static void FloydWarshallAlgo(int[][] graph, int size){

        for(int k=0;k<size;k++){
            for(int j=0;j<size;j++){
                for(int i=0;i<size;i++){

                    if(graph[i][k] != Integer.MAX_VALUE && graph[k][j] != Integer.MAX_VALUE){
                        if(graph[i][j] > graph[i][k] + graph[k][j]){
                            graph[i][j] = graph[i][k] + graph[k][j];
                        }
                    }    
                }
            }
        }

       for(int i=0;i<size;i++){
           //for(int j=0;j<n;j++){
               System.out.println(Arrays.toString(graph[i]));
           //}
       } 

    }
}
