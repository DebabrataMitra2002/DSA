public class pattern_recu{
    // Method to print a single line of stars
    static void printLine(int n) {
        if (n > 0) {
            System.out.print("* ");
            printLine(n - 1);
        }
    }

    // Method to print a square of stars
    static void printSquare(int n) {
        if (n > 0) {
            int m=n;
            printLine(m);
            System.out.println();
            printSquare(n - 1);
        }
    }

    public static void main(String[] args) {
        printSquare(5);  // Size of the square
    }
}
