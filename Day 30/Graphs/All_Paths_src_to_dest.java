import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class All_Paths_src_to_dest {
    static class Edge{
        int src;
        int dest;
        public Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph,graph.length);
        int src=5;
        int d=1;
        printallpaths(graph, src, d, "");
    }

    public static void createGraph(ArrayList<Edge>[] graph,int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    private static void printallpaths(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src==dest){
            System.out.println(path+src);
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e= graph[src].get(i);
            printallpaths(graph, e.dest, dest, path+src);
        }
    }

    
}
