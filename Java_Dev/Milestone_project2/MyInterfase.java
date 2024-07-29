//There are three type of interface. 1:Normal  , 2: Functional(SAM){Single Abstuct Method} , 3: Marker(Empty interface)
//Lamda expresion work with only SAM .
/**
 * InnerMyInterfase
 */
 interface A {
void show();
    
}



public class MyInterfase {
    public static void main(String[] args) {

        // A obj=new A() {
        //     @Override
        //     public void show() {
        //         System.out.println("in show.");
        //     }
            
        // };
        // obj.show();
        A obj2=()-> System.out.println("in Lamda Expre.");
        obj2.show();
        
    }
}
