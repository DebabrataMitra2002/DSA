import java.util.Scanner;

public class cognizant2024 {
    public static int ConvertString(String s1,String s2){
        int sum=0;
// StringBuilder a1=new StringBuilder();
// StringBuilder a2=new StringBuilder();
int a1[]=new int[26];
int a2[]=new int[26];
for(int i=0;i<s1.length();i++)
{
    a1[(s1.charAt(i)-'A')]++;
}
for(int i=0;i<s2.length();i++)
{
    a2[(s2.charAt(i)-'A')]++;
}
for(int i=0;i<26;i++){
    if(a1[i]<a2[i])
    {
        sum+=(a2[i]-a1[i]);
    }
}


        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String s1:");
        String s1=sc.nextLine();
        System.out.println("Enter the String s2:");
        String s2=sc.nextLine();
        System.out.println("Your result:"+ConvertString(s1,s2));

    }
}
