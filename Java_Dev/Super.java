class A
{
public A()
{
System.out.println("in A");
}
public A(int n)
{
    this();
   System.out.println("in A int."); 
}


}


class B extends A 
{
public B()
{   

    super(2);
    System.out.println("in B");
}
public B(int m)
{
   
// super(2);
 this();
System.out.println("in B int");
}


    
}



public class Super {
    public static void main(String[] args) {
        B b=new B(2);

    }
}
