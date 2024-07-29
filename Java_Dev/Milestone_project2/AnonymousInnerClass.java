interface MyInterface {
abstract void myMethod();
}


class MyClass implements MyInterface{
public void myMethod(){
System.out.println("Extend thye class and implementing an interface.");
}
}



public class AnonymousInnerClass {
    public static void main(String[] args) {
        MyClass obj1= new MyClass()
        {

            @Override
            public void myMethod() {
             System.out.println("Anonymous inner class exteding a class.");
            }
            
        };
obj1.myMethod();

        MyInterface obj2= new MyInterface() {

            @Override
            public void myMethod() {
                System.out.println("Anonymous inner class implementing a interface.");
                
            }
            
        };

        obj2.myMethod();
        
    }
}
