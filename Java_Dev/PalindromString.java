

public class PalindromString {

    public static boolean IsPalindrome(String input)
    {
        if(input.length()==1)
        return true;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)!=input.charAt(input.length()-i-1))
            {
            return false;
            }
        }
        return true;
    }
        

        
        
    
    public static void main(String[] args) {
boolean a=IsPalindrome("eye");

        System.out.println(a);
        
    }
}
