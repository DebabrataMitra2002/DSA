import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return  age + " : " + name;
    }
    @Override
    public int compareTo(Student that) {
        if (this.age>that .age) 
        return 1;
        else
        return -1;    
        
        
    }


}

public class ShortArrayOfObject {

    public static void main(String[] args) {
        // Comparator<Student> com = new Comparator<>() {     //this is a anonymous class.
        //     public int compare(Student a , Student b){
        //         if (a.age>b.age) 
        //         return 1;
        //         else
        //         return -1;
                    
        //     }
        // };
        // Consumer<Student> consumer = new Consumer<Student>() {  // This is a anonymous class
            
        //     public void accept(Student s){
        //         System.out.println(s);
        //         }
        // };
        Consumer<Student> consumer = (n)->{System.out.println(n);};
        // Comparator<Student> com = (a,b)-> a.age>b.age ?1:-1 ; 
        List<Student> inf = new ArrayList<>();
        inf.add(new Student(12, "ram"));
        inf.add(new Student(19, "elama"));
        inf.add(new Student(21, "pagla"));
        inf.add(new Student(76, "debo"));
        inf.add(new Student(55, "bidisha"));
        inf.add(new Student(45, "rai"));
        // Collections.sort(inf,(a,b)-> a.age>b.age ?1:-1); // lamda expresion of Comparator<> interface.
        // Collections.sort(inf,com);
        // inf.forEach((n)->System.out.println(n)); // lamda expresion of Consumer interface.
        Collections.sort(inf);
        inf.forEach(consumer);
    }
    
    
    
}
