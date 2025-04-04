package DemoPackage;

public class Add {
    int a;
    int b;
    int c;
    // Method with two arguments
   public Add(int a,int b){
this.a=a;
this.b=b;
  System.out.println("constuctor overloding for two parameter:"+(a+b));
   }
   public Add(int a,int b,int c){
    this.a=a;
    this.b=b;
      System.out.println("constuctor overlodin for three parametr:"+(a+b+c));
       }
    public Add(){

    }

    
}
