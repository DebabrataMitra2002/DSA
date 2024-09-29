import java.util.*;
public class NotConectedGraphBfs {
    static void bfs(List<List<Integer>> adj ,int s,boolean []visited)
    {
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty()){
            int curr=   q.poll();
            System.out.print(curr+" ");
            for(int x:adj.get(curr))
            {
                if(!visited[x])
                {
                    visited[x]=true;
                    q.offer(x);
                }
            }
        }

    }

    static void NotConectedGraph_bfs(List<List<Integer>> adj ){
    boolean [] visited =new boolean[adj.size()];
    for(int i = 0;i<adj.size();i++)
    {
        if(!visited[i])
        {
            bfs(adj, i, visited);
        }
    }   
    }

    static void addEdge(List<List<Integer>> adj,int u,int v)
    {  adj.get(u).add(v);
        adj.get(v).add(u);

    }

    
    public static void main(String[] args) {
        int V = 6; // Number of vertices
        List<List<Integer>> adj = new ArrayList<>(V); 

        // Initialize adjacency lists
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);  
        NotConectedGraph_bfs(adj);
       
    }
}
