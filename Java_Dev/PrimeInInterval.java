public class PrimeInInterval { 
    public static void main(String[] args) {
        int a = 2, b = 20, i, j,flag,count = 0;
        
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
                flag=0;
            // boolean isPrime = true;
            for (j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    // isPrime = false;
                    flag++;
                    // break;
                }
            }
            if (flag==2)
                count++;
        }
        System.out.println("Number of prime numbers between " + a + " and " + b + ": " + count);
    }
}

