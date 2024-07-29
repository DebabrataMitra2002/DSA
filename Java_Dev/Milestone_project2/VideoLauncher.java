import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) 
    {
      VideoStore stroe = new VideoStore();
      Scanner scanner=new Scanner(System.in);
      int choice=0;
      do{
        System.out.println("1. Add Video");
        System.out.println("2. Check Out Video");
        System.out.println("3. Return Video");
        System.out.println("4. Receive Rating");
        System.out.println("5. List Inventory");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        choice=scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter the name of the video: ");
                String name = scanner.nextLine();
                stroe.addVideo(name);
                break;
            case 2:
                System.out.println("Enter the name of the video to check out: ");
                name = scanner.nextLine();
                stroe.doCheckout(name);
                break;
            case 3:
            System.out.println("Enter the name of the video to return: ");
            name= scanner.nextLine();
            stroe.doReturn(name);
            break;
            case 4:
            System.out.println("Enter the name of the video to rate");
            name = scanner.nextLine();
            int rating =scanner.nextInt();
            stroe.reciveRating(name, rating);
            break;
            case 5:
            stroe.listinventory();
            break;
            case 6:
            System.out.println("Exiting...");
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
    }
        while (choice!=6);   
        scanner.close();    
        

      }
    }

