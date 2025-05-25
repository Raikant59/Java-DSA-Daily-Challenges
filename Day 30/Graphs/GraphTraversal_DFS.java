import java.util.*;
public class GraphTraversal_DFS {
    static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src=src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
    }

    static void createGraph(ArrayList<Edge>[] graph){
         for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 2));

        int curr=0;
        boolean vis[]=new boolean[graph.length];

        dfs(graph,curr,vis);
    }

    static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
}
