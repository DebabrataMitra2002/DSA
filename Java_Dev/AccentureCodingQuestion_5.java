import java.util.Scanner;

public class AccentureCodingQuestion_5 {
public static int OperationsBinaryString(String str){
    int pre=str.charAt(0)-'0';
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)=='A')
        {
            i++;
            pre&=str.charAt(i)-'0';
        }
        else if(str.charAt(i)=='B')
        {
            i++;
            pre|=str.charAt(i)-'0';
        }
        else if(str.charAt(i)=='C')
        {
            i++;
            pre^=str.charAt(i)-'0';
        }
        
        
    }
    return pre;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Your result is:"+OperationsBinaryString(str));

        
    }
}
