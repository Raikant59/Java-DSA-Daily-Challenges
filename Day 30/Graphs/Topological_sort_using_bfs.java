import java.util.*;
public class Topological_sort_using_bfs {
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
    }

    public static void createGraph(ArrayList<Edge>[] graph,int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        toposort(graph);

    }

    public static void calcindeg(ArrayList<Edge>[] graph,int indeg[]){
        for(int i=0;i<graph.length;i++){
            // i means vertex
            for(int j=0;j<graph[i].size();j++){
               Edge e = graph[i].get(j);
               indeg[e.dest]++;
            }
        }
    }

    public static void toposort(ArrayList<Edge>[] graph){
        int indeg[]=new int[graph.length];
        calcindeg(graph, indeg);
        Queue<Integer> q= new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr= q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }
}
