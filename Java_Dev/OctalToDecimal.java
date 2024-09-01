import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String []a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Octal number:");
       
        String str=sc.nextLine(); 
        int sum=0,base=1,n=str.length();
        for(int i=n-1;i>=0;i--){
            sum+=(str.charAt(i)-'0')*base;
            base*=8;
        }
        System.out.print("Decimal number is:"+sum);
    }
}
