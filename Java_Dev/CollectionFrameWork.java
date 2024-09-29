import java.util.*;

public class CollectionFrameWork {
    public static void main(String[] args) {
    // List<Integer> array=new ArrayList<>();
    // array .add(2);
    // array.add(12);
    // array.add(2,13);
    // System.out.println(array);
    // List<Integer> array1=new ArrayList<>();
    // array1.add(1);
    // array1.addAll(array);
    // System.out.println(array1); 
    // for(int i:array1){
    //     System.out.println(i);
    // }  
    // System.out.println(array1.get(array1.size()-1)); 
   
    //   Stack<Character> stack= new Stack<>();
    //   Scanner sc=new Scanner(System.in);
    //   String s=sc.nextLine();
    //   for(char i : s.toCharArray()){
    //     stack.add(i);
    //   }
    //   StringBuilder sb= new StringBuilder();
    
    //   while(!stack.isEmpty())
    //   {sb.append(stack.peek());
    //     stack.pop();
    //     }
      
    // System.out.println(sb.toString());

Queue<Integer> queue = new LinkedList<>();
queue.offer(23);
queue.offer(13);
queue.offer(15);
System.out.println(queue);
for(int i:queue){
System.out.println(i);
}
    }
}
