import java.util.Scanner;

public class AccentureCodingQuestion_7 {
   
    public static int NumberOfCarries(int num1 , int num2){
        int count=0;
        int carry=0;
while(num1>0 && num2>0){
  if((carry+num1%10+num2%10)>9)
  {
    count++;
    carry=(num1%10+num2%10)%9;
}
num1/=10;
num2/=10;
}
return count;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int n1=sc.nextInt();
        System.out.println("Enter num2:");
        int n2=sc.nextInt();
        System.out.println("your result is :"+NumberOfCarries(n1,n2));
    }
}
