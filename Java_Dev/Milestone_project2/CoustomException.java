class MyException extends Exception {

    public MyException(String string) {
        super(string);
    }
}

public class CoustomException {
    public static void main(String[] args) {

        int i = 63;
        int j = 0;
        try {

            try {
                if (j == 0) 
                    throw new MyException("j == 0");
                
            }
            catch (MyException r) 
            {
                System.out.println("i am in coustom exception" + r);

            }
            
            int result = i / j;
            System.out.println(result);

        } 
        
        catch (ArithmeticException e) {
            System.out.println("dont do that..");
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
        
        
        System.out.println("Well done..");
    }
}