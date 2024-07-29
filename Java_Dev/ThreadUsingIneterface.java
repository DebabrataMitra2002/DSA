// class A implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i < 100; i++) {
//           System.out.println("dola");
//         try {
//             Thread.sleep(3);
//         } catch (Exception e) {
//             e.getStackTrace();
//         }  
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i < 100; i++) {
//            System.out.println("debo");
//         try {
//             Thread.sleep(3);
//         } catch (Exception e) {
//             e.getStackTrace();
//         } 
//         }

//     }
// }

public class ThreadUsingIneterface {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("dola");
                }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("debo");
                }
            
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
