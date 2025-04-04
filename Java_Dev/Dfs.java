
import java.util.*;

public class Dfs {
public static void AddNode(List<List<Integer>> adj,int u,int v){
    adj.get(u).add(v);
    adj.get(v).add(u);
}
public static void dfs(List<List<Integer>> adj,int s,boolean []v){
    v[s]=true;
    System.out.print(s+" ");
    for(int x:adj.get(s)){
        if(!v[x]){
            dfs(adj,x,v);
        }
    }
}
  public static void main(String[]arg){
    int v=5;
    List<List<Integer>> adj=new LinkedList<>();
    for(int i=0;i<v;i++){
        adj.add(new LinkedList<>());
    }   
    AddNode(adj,0,1);
    AddNode(adj,0,2);       
    AddNode(adj,1,3);
    AddNode(adj,1,4);
    AddNode(adj,2,4);
    AddNode(adj,3,4);
    boolean [] visited=new boolean[v];
    System.out.println("DFS Traversal of the graph is:");
    dfs(adj,0,visited);         


  }   

    
}
