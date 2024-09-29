import java.util.*;
public class GraphDfs {
    
    static void addEdge(List<List<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    static void dfs(List<List<Integer>> adj,int s,boolean [] visited){
        visited[s]=true;
        System.out.print(s+" ");
        for(int x:adj.get(s))
        {
            if(!visited[x]){
               visited[x]=true;
                dfs(adj, x, visited);
            }
        }
        
    }
    
static void DFS(List<List<Integer>> adj)
{
    boolean [] visited=new boolean[adj.size()];
    for(int i=0;i<adj.size();i++){
        if(!visited[i]){
            dfs(adj,i,visited);
        }
    }
}

    public static void main(String[] args) {
        int V = 5; // Number of vertices in the graph

        // Create an adjacency list for the graph
        List<List<Integer>> adj=new LinkedList<>();
        for(int i=0;i<V;i++){
            adj.add(new LinkedList<>());
        }
         // Define the edges of the graph
         int[][] edges = {
            { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3 }, { 2, 4 }
        };
        for(int []x:edges)
        {
            addEdge(adj,x[0],x[1]);
        }
        DFS(adj);
    }
}
