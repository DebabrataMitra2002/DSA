import java.util.regex.Pattern;

import java.util.regex.Matcher;


public class Regex {
    public static void main(String[] args) {
        // int t = 12345; // Example integer, you can change it as needed
        // String input = String.valueOf(t); // Convert integer to string
        // int t = 123243;
        // String input =t+"" ;
        // String input = "123 456";
        String input = "123 456";
        // Define the pattern
        Pattern pattern = Pattern.compile("[0-9]+");
        // Create a matcher object
        Matcher matcher = pattern.matcher(input);

        // Check if the pattern matches the input
        boolean matches = matcher.matches();
        System.out.println("Matches: " + matches);
        
        // Find the next subsequence that matches the pattern
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
            System.out.println("Start index: " + matcher.start());
            System.out.println("End index: " + matcher.end());
        }
       
        

        // String input = "abc123def456";
        
        // // Define a pattern that looks for one or more digits
        // Pattern pattern = Pattern.compile("\\d+");
        
        // // Create a matcher object
        // Matcher matcher = pattern.matcher(input);
        
        // // Check if the entire input matches the pattern
        // boolean matches = matcher.matches();
        // System.out.println("Entire input matches pattern: " + matches);
        
        // // Find occurrences of the pattern in the input
        // while (matcher.find()) {
        //     System.out.println("Found: " + matcher.group());
        //     System.out.println("Start index: " + matcher.start());
        //     System.out.println("End index: " + matcher.end());
        // }
    }
}
