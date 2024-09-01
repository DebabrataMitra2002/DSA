import java.util.*;
public class CodingQuestion_2 {
 
public static int LargeSmallSum(int[]arr,int length){
   List<Integer> arr1 =new ArrayList<>();
   List<Integer> arr2 =new ArrayList<>();
for(int i =0;i<length;i++)
{
    if(i%2==0){
        arr1.add(arr[i]);}
    else{
        arr2.add(arr[i]);
    }
}
arr1.sort(null);
arr2.sort(null);

return (arr2.get(arr2.size()-2))+6
(arr1.get(arr1.size()-2));
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of term of arry:");
    int len=sc.nextInt();
    int arr2[]=new int[len];
    System.out.println("Enter the arry element:");
    for(int i=0;i<len;i++){
        arr2[i]=sc.nextInt();
    }
    System.out.println("Yoru result is:"+LargeSmallSum(arr2,len));
}

}
