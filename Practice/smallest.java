package Practice;

public class smallest {

    public static void main(String[] args) {
        int n = 121, num = 0, r = 0;
        while (n > 0)
            ;
        {
            r = n % 10;
            n = n / 10;
            num = num + r;
            num = num * 10;

        }
        if (num == n) {
            System.out.println("palindrome:");
        } else {
            System.out.println("Not palindrome:");
        }
    }
}
