import java.util.*;

public class AccentureCodingQuestion_9 {
    public static int Count(int a)
    {
        int count=0;
        while(a>0 && a%2==0)
        {
            count++;
     a/=2;
        }
        return count;
    }

public static int MaxExponents (int a , int b){
    int max=0;
    int ans=0;
    for(int i=a;i<=b;i++){
        int temp=Count(i);
        if(temp>max){
            max=temp;
            ans=i;
        }
    }
    return ans;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enetr the range a to b:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Your result is :"+MaxExponents(a,b));
    }
}
