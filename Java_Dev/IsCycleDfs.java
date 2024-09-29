import java.util.LinkedList;
import java.util.List;

class IsCycleDfs{
static boolean IsCycle(List<List<Integer>> adj,int V){
    boolean [] visited=new boolean[V];
    for(int i=0;i<V;i++){
if(!visited[i])
if(dfs(adj,visited,i,-1))
return true;
    }
    return false;
}

static boolean dfs(List<List<Integer>> adj ,boolean[] visited,int s,int p){
visited[s]=true;
for(int neighbour : adj.get(s)){
    if(!visited[neighbour])
    {
       if( dfs(adj, visited,neighbour, s))
        return true;
    }
    else if(p!=neighbour)
    return true;

}
return false;
}

static void addEdge(List<List<Integer>> adj,int u,int v){
    adj.get(u).add(v);
    adj.get(v).add(u);
}
public static void main(String[] args) {
      int V = 7; // Number of vertices in the graph

        // Create an adjacency list for the graph
        List<List<Integer>> adj=new LinkedList<>();
        for(int i=0;i<V;i++){
            adj.add(new LinkedList<>());
        }
         // Define the edges of the graph
        int[][] edges = {
            {0, 1 }, { 0, 2 }, { 3, 4 }, { 4, 5 }, { 4, 6 },{5,6}
        };
        // int[][] edges = {
        //     {0, 1 }, { 0, 2 }, { 3, 4 }, { 4, 5 }, { 4, 6 }
        // };
        for(int []x:edges)
        {
            addEdge(adj,x[0],x[1]);
        }
       System.out.println(IsCycle(adj,V)); 
}


}