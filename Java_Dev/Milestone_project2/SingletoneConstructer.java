class A
{
private static A instance = null;
private A()
{
 


}
public static A creat_object()
{
    if (instance == null) {
         instance=new A();
    }
    return instance;
}

public void mgs()
{
System.out.println("Singletone example.");
}


}


public class SingletoneConstructer {
    public static void main(String[] args) {
A obj = A.creat_object();
obj.mgs();
        
    }
}
