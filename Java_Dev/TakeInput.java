import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("In old time :");
        // System.out.println("Enter the number:");
        // int num = System.in.read(); // it take as single charecter , and gives the
        // ascii value.
        // System.out.println(num); //for the big value we need to lopping.But java
        // provide the BufferedReder class for it.
        
        
        // System.out.println("Enter the number:");
        // InputStreamReader in1 = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in1);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();
         
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();
        System.out.println(num);


    }
}
