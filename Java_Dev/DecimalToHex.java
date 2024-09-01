import java.util.*;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decmial :");
        int n=sc.nextInt();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<n;i++)
        {
            if(n%16==10)
            str.append("A");
            else if(n%16==11)
            str.append("B");
            else if(n%16==12)
            str.append("C");
            else if(n%16==13)
            str.append("D");
            else if(n%16==14)
            str.append("E");
            else if(n%16==15)
            str.append("F");
             n/=16;


        }
        System.out.println("Hexnumber:"+str.toString());
    }
}
