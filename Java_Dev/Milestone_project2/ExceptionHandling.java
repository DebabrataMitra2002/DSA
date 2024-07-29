import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    try  {
        System.out.println("Enter the number of element in the array.");    
        int n=scanner.nextInt();
        
        int []a =new int[n];
        System.out.println("Enter the element in the array.");
        for (int i=0;i<a.length;i++) {
            a[i]=scanner.nextInt();
            
        }
        // for (int i : a) {
        //     System.out.println(i);
        // }
System.out.println("Enter the index of the array element you want to access.");
        
             n=scanner.nextInt();
            System.out.println("The array element at index"+n+" = "+a[n]);
            System.out.println("The array element successfully accessed");
    }
 catch (InputMismatchException e) {
        
           System.out.println("java.lang.NumberFormatException");
        } 
catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("java.lang.ArrayIndexOutOfBoundsException");
}


    }
}
