import java.util.*;

public class heapMaxInArray  {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            list.add(a[i]);
        }
        System.out.println("MAX:" + list.poll());
    }
}
