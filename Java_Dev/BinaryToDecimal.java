import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String []a)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Binary number:");
      String  str=sc.nextLine();
      int i,n=str.length(),sum=0,base=1;
    for(i=n-1;i>=0;i--)
    {
        sum+=(str.charAt(i)-'0')*base;
        base*=2;
    }
    System.out.println("Decimal:"+sum);
      

    }
}
