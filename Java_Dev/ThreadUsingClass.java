class A extends Thread{
public void run()
{
     for(int i =0;i<=100; i++){
          System.out.println("hello");
          try {
               Thread.sleep(2);
          } catch (InterruptedException e) {
             
               e.printStackTrace();
          }
}
}
}


class B extends Thread 
{
public void run()
{
     for(int i =0;i<=100; i++)
{
          System.out.println("hi");
          try {
               Thread.sleep(2);
          } catch (InterruptedException e) {
              
               e.printStackTrace();
          }
}
}
}


public class ThreadUsingClass{
     public static void main(String[] args) {
        A obj1 =new A();
        B obj2 = new B();

        obj1.start();
        try {
          Thread.sleep(4);
        } catch (Exception e) {
          
        }
        obj2.start();
     }
}
