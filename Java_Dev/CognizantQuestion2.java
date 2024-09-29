import java.util.*;

public class CognizantQuestion2 {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the valid input:");
System.out.println("Enter the no of liters to fill the tank");
int a=sc.nextInt();
if(a<=0)
{
    System.out.println("You put invalid in put:");

}
System.out.println("Enter the distance covered");
int b=sc.nextInt();
if(b<=0)
{
    System.out.println("You put invalid in put:");
}

System.out.println("Liters/100KM");
System.out.println(((a/b)*100));
System.out.println("Miles/gallons");
double c=a*0.2642;
double d=b*0.6214;


System.out.println((c/d));

    }
}
