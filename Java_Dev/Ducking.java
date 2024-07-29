class A  {
    public A()
    {
        {System.out.println("in intislizer block of class A()");}
    }
    {
        System.out.println("outside of the A() constrector.");
    }
    static{
        System.out.println("static block of class A()");
    }
public void show() throws ClassNotFoundException{
    Class.forName("Ducking");//by using the concept of ducking Exception.
}
    
}


public class Ducking {
    static{
        System.out.println("class loaded.");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        A obj = new A();
        obj.show();
        System.out.println("well done.");
    }
}
