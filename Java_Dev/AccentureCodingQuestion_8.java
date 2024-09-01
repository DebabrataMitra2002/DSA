import java.util.*;
public class AccentureCodingQuestion_8 {
    
   public static void ReplaceCharacter(char str[], int n, char ch1, char ch2){
for(int i=0;i<str.length;i++){
if(str[i]==ch1)
{
    str[i]=ch2;
}
else if(str[i]==ch2)
{
    str[i]=ch1;
}
}
String s=new String(str);
System.out.println("Your result is:"+s);
   } 
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String st=sc.nextLine();
        System.out.println("Enter char1 and char2:");
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        ReplaceCharacter(st.toCharArray(),st.length(),c1,c2);

    }
}
