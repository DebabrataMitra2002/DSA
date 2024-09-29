import java.util.ArrayList;
import java.util.Scanner;

public class GraphPractice {
    public static void main(String[] args) {
        //adjacency matrix:
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertx:");
        int V =sc.nextInt();
        System.out.println("Enter the number of Edges");
        int E =sc.nextInt();
        int a[][]=new int[V+1][V+1];

        //adjacency List:
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
        adj.add(new ArrayList<>());
        }

    }
    public static void addList(int a[][],int dest,int source){
        a[dest][source]=1;
        a[source][dest]=1;
}
    public static void addList(ArrayList<ArrayList<Integer>> adj,int dest,int source)
{
    adj.get(source).add(dest);
    adj.get(dest).add(source);
}
}
