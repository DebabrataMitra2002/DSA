import java.util.*;
public class OctalToBinary {
    
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number:");
        int num=sc.nextInt();
        int sum=0,base=1,i;
    //    convert Octal to Decimal:
       while(num>0)
       {sum+=(num%10)*base;
        num/=10;
        base*=8;
       }
       System.out.println("binary="+ToBinary(sum));

    }

    static String ToBinary(int a)
    {StringBuilder str=new StringBuilder();
        while(a>0)
        {
            str.append((a%2)+"");
            a/=2;
        }
        return str.reverse().toString();
    }
}
