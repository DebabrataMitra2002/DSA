// The function def differenceofSum(n. m) accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.

// Assumption:

// n>0 and m>0
// Sum lies between integral range
// Example

// Input
// n:4
// m:20
// Output
// 90

// Explanation

// Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
// Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
// Difference 150 – 60 = 90
// Sample Input
// n:3
// m:10
// Sample Output
// 19
import java.util.*;
public class DifferenceOfSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range 1 to m");
        int m=sc.nextInt();
        System.out.println("Enter the number divisor:");
        int n=sc.nextInt();
        int sum=0,sum1=0;
        for(int i=0;i<m;i++){
            if((i+1)%n==0)
            sum+=(i+1);
            else
            sum1+=(i+1);
        }
        System.out.println("Result is :"+(sum1-sum));

    }
}
