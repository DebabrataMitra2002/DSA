class A{
    public int a,b;
    A(int x,int y){
        a=x;
        b=y;
     }

     int add(){
        return a+b;
     }
}


public class Demo1 {
   public static void main(String[] args) 
    {
        A obj1=new A(6,7);
        A obj2=new A(16,17);
        A obj3=new A(6,17);
        A obj4=new A(62,7);
        System.out.println("Add two number:"+obj1.add());
        System.out.println("Add two number:"+obj2.add());
        System.out.println("Add two number:"+obj3.add());
        obj4.x=12;
        System.out.println("Add two number:"+obj4.add());
    }
}
