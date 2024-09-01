import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccentureCodingQuestion_10
{
 public static void main(String[] args) {
    List<Integer> arr1=new ArrayList<>();
    List<Integer> arr2=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of term:");
    int n=sc.nextInt();
    System.out.println("Enter the array:");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if(i%2==0)
        arr1.add(a[i]);
        else
        arr2.add(a[i]);
    }
    arr1.sort(null);
    arr2.sort(null);
    if(arr1.size()<2 && arr2.size()>=2){
 System.out.println(arr2.get(arr2.size()-2));
 }
else if(arr2.size()<2 && arr1.size()>=2)
{
    System.out.println(arr1.get(arr1.size()-2));
}
else if(arr1.size()<2 && arr2.size() <2)
{
    System.out.println("0");
    
}
else
System.out.println(arr1.get(arr1.size()-2)+arr2.get(arr2.size()-2));
    }
}
