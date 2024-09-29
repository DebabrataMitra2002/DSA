import java.util.*;
public class BFS {
    
    static void bfs(List<List<Integer>> adj ,int s,boolean [] visited){
        Queue<Integer> q =new LinkedList<>();
         visited[s]=true;
         q.offer(s);
         while (!q.isEmpty()) {
            int curr=q.poll();
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

    static void addEdge(List<List<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Edges:");
        int V=sc.nextInt();
        List<List<Integer>> adj=new LinkedList<>();
        for(int i =0;i<V;i++){
            adj.add(new LinkedList<>());

        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);

        // Mark all the vertices as not visited
        boolean[] visited = new boolean[V];
        bfs(adj, 0, visited);

    }
}
