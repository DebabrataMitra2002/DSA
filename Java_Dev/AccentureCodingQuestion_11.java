import java.util.Scanner;

public class AccentureCodingQuestion_11 {

    public static int Calculate(int m, int n){
        int sum=0;
       for(int i=m;i<=n;i++){
        if(i%3==0 && i%5==0)
        sum+=i;
       } 
       return sum;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Your Result:"+Calculate(m,n));
    }
}
