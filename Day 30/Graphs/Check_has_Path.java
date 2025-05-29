import java.util.ArrayList;

public class Check_has_Path {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 2, 1));

        // bfs(graph,graph.length);
       
    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        boolean visited[]=new boolean[graph.length];
        int src=0;
        int dest=3;
        boolean ans = haspath(graph, src, dest, visited);
        System.out.println(ans);
    }

    static boolean haspath(ArrayList<Edge>[] graph,int src,int d,boolean visited[]){
        if(src==d){
            return true;
        }
        visited[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!visited[e.dest] && haspath(graph, e.dest, d, visited)){
                return true;
            }
        }   
        return false;
    }
}
