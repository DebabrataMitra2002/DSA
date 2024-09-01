import java.util.*;

public class AccentureCodingQuestion_3 {

public static int ProductSmallestPair(int sum, int[] arr,int len){
    List<Integer> arr1=new ArrayList<>();
    for(int i=0;i<len;i++){
        arr1.add(arr[i]);
    }
arr1.sort(null);
if(arr1.isEmpty() || arr1.size()<2)
return -1;
else if(arr1.get(0)+arr1.get(1)<sum)
return arr1.get(0)*arr1.get(1);
else 
return 0;
    

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of term :");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter sum:");
        int sum=sc.nextInt();
        System.out.println("Your result is :"+ProductSmallestPair(sum,a,n));
    }
}
