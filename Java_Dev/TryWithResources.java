import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("Enter your input number:");
        BufferedReader bf = null;
        // try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))   
        // {     //After some time when try block was excuted then the resource would be close automatically because BufferedRedear impliments the AutoCloseable interface,other wise resource close manualyusing finally block.
        //     int num = Integer.parseInt(bf.readLine());               
        //     System.out.println(num);
        // }
        try{
            bf = new BufferedReader(new InputStreamReader(System.in)); 
            int num = Integer.parseInt(bf.readLine());               
            System.out.println(num);
        }
        
        finally{
            bf.close();
        }
    }
}
