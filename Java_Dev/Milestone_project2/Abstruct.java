abstract class A
{
public void show()
{
System.out.println("in A class.");
}
abstract void show1();
}

class B extends A{
    
// public void show()
// {
//     System.out.println("in B class.");
// }  
// output:in show1 from A class.
// in A class.
// in show from class B.
// in A class.
void show1() {
    System.out.println("in show from class B.");
}
    
}




public class Abstruct {
    public static void main(String[] args) {
        A obj =new A() {   // this is called the anonymous class.
            void show1() {
                System.out.println("in show1 from A class.");
        }
    };
        obj.show1();
        obj.show();
        obj=new B();
        obj.show1();
        obj.show();   //it call super class:
    }
}



// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.