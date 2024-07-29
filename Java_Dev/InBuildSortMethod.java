import java.util.*;

public class InBuildSortMethod {
    public static void main(String[] args) {
        //we use some coustom logic for sort algo like sort for last digit.
        // Comparator<Integer> com = new Comparator<Integer>() {

        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         if(o1%10 > o2%10)
        //         return 1;
        //         else
        //         return -1;
        //     }
            
        //  };
  
        //using lamda expresion
        Comparator<Integer> com =(i,j)-> i%10 > j%10 ? 1 : -1 ;
        
        List<Integer> num =new ArrayList<>();
        num.add(23);
        num.add(25);
        num.add(12);
        num.add(67);
        num.add(93);
        num.add(102);
        num.add(103);
        Collections.sort(num,com);
    
        System.out.println(num);
    //    Collections.reverse(num);
    //     System.out.println(num); 
        
    }
     
}
