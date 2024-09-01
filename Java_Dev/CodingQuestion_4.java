import java.util.*;
import java.util.Scanner;

public class CodingQuestion_4 {

// public static String DectoNBase(int n, int num){
//     StringBuilder s=new StringBuilder();
//     int n1;
//     while(num>0){
// n1=num%n;
// switch (n1) {
//         case 0:
//         s.append('0');
//           break;
//         case 1:
//         s.append('1');
//           break;
//           case 2:
//         s.append('2');
//           break;
//           case 3:
//         s.append('3');
//           break;
//           case 4:
//         s.append('4');
//           break;
//           case 5:
//         s.append('5');
//           break;
//           case 6:
//         s.append('6');
//           break;
//           case 7:
//         s.append('7');
//           break;
//           case 8:
//         s.append('8');
//           break;
//           case 9:
//         s.append('9');
//           break;
//           case 10:
//         s.append('A');
//           break;
//           case 11:
//         s.append('B');
//           break;
//           case 12:
//         s.append('C');
//           break;
//           case 13:
//         s.append('D');
//           break;
//           case 14:
//         s.append('E');
//           break;
//           case 15:
//         s.append('F');
//           break;
//           case 16:
//         s.append('G');
//           break;
//           case 17:
//         s.append('H');
//           break;
//           case 18:
//         s.append('I');
//           break;
//           case 19:
//         s.append('J');
//           break;
//           case 20:
//         s.append('K');
//           break;
//           case 21:
//         s.append('L');
//           break;
//           case 22:
//         s.append('M');
//           break;
//           case 23:
//         s.append('N');
//           break;
//           case 24:
//         s.append('O');
//           break;
//           case 25:
//         s.append('P');
//           break;
//           case 26:
//         s.append('Q');
//           break;
//           case 27:
//         s.append('R');
//           break;
//           case 28:
//         s.append('S');
//           break;
//           case 29:
//         s.append('T');
//           break;
//           case 30:
//         s.append('U');
//           break;
//           case 31:
//         s.append('V');
//           break;
//           case 32:
//         s.append('W');
//           break;
//           case 33:
//         s.append('X');
//           break;
//           case 34:
//         s.append('Y');
//           break;
//           case 35:
//         s.append('Z');
//           break;
//          default:
//             break;
//        } 
//        num/=n;
//     }
//     return s.reverse().toString();
// }

public static String DectoNBase(int n, int num){
    List<Integer> arr = new ArrayList<>();
    String str="";
    while(num>0){
        arr.add(num%n);
        num/=n;
    }
    for(int i:arr){
        if(i>9){
str=(char)(i-9+64)+str;
        }
        else
        str=i+str;
    }
    return str;
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number;");
        int num=sc.nextInt();
        System.out.println("Enter Base:");
        int n=sc.nextInt();
        System.out.println("Your result :"+DectoNBase(n,num));


    }
}
