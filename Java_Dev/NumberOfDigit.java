import java.util.*;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        
        System.out.println("Find the Digit:");
        int x = sc.nextInt();
        
        int count = 0;
        String s = Integer.toString(num);
        
        // Corrected loop (removed semicolon after the loop)
        for (int i = 0; i < s.length(); i++) {
            // Corrected character comparison
            if (s.charAt(i) == (char)(x+'0')) {
                count++;
            }
        }

        System.out.println("The digit " + x + " is present " + count + " times.");
    }
}
