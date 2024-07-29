class Abc{
int a=0;
int b=12;
public void show1() {
    System.out.println( "num1="+a+"and num2="+b);
    System.out.println("in A class .");
}
}
class Xyz extends Abc{ 
   
public void show2(){
    System.out.println("num1="+a+" and num2="+b);
    System.out.println("in B class.");
}
}


public class DownCasting {
    public static void main(String[] args) {
        // DownCasting d=new DownCasting();
        // System.out.println(d instanceof DownCasting);
        // DownCasting d = null;
        // System.out.println(d instanceof DownCasting);
    //     Abc abc =new Xyz();  //Upcasting;
    //     abc.show();          // Method Overriding
        //    Xyz xyz=(Xyz) new Abc();
        Abc abc = new Xyz();
        //    abc.show1();
           Xyz obj;
           obj=(Xyz)abc;  // downcasting
           
           obj.show2();  
            
} 
}
