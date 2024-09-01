import java.util.Scanner;

public class AccentureCodingQuestion_6 {
public static int findCount(int arr[],int length,int num,int diff){
    int count=0;
for(int i=0;i<length;i++)
{
if(Math.abs(arr[i]-num)<=diff)
{
count++;
}
}
if(count==0 || length==0)
return -1;
else
return count;
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the arry:");
        int length=sc.nextInt();
        System.out.println("enter the Array");
        int arr[]=new int[length];
        for(int j=0;j<length;j++)
        {
        arr[j]=sc.nextInt();
        }
        System.out.println("Enter the num:");
        int num=sc.nextInt();
        System.out.println("Enter the diff:");
        int diff=sc.nextInt();
        System.out.println("your result is :"+ findCount(arr,length,num,diff));

    }
}
