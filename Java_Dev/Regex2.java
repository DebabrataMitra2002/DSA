import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        // String input = "My email is example@test.com and my phone number is 123-456-7890. w@e.i";
        String input = "My email";
        // Define a pattern with capturing groups
        // Pattern pattern = Pattern.compile("(\\w+)@(\\w{5}).(\\w+)");
        // Pattern pattern = Pattern.compile("(\\w+)@(\\w+).(\\w+)");
        Pattern pattern = Pattern.compile("(\\w+) (\\w+)");
        
        // Create a matcher object
        Matcher matcher = pattern.matcher(input);
        
        // Find occurrences of the pattern in the input
        System.out.println("Total groups: " + matcher.groupCount());
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
            System.out.println("Total groups: " + matcher.groupCount());
            
            // Print all capturing groups
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
