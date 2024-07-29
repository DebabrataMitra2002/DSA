
enum Status // in java enum it treate as a class .
// and the content of the enum is object .
{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {

        Status obj = Status.Running;
        // System.out.println( obj);
        // System.out.println( obj.ordinal());
        // Status[] s = Status.values();
        // System.out.println(s[2]);
        // for (Status status : s) {
        //     System.out.println(status + " : " + status.ordinal());
        //}
        if(obj == Status.Running)
        {System.out.println("all good");}
        else if(obj == Status.Failed)
        {
            System.out.println("Try Again.");

        }
        else if(obj == Status.Pending)
        {
            System.out.println("Wating for a while.");
        }
        else
        {
            System.out.println("Done");
        }

switch (obj) {
    case Running :
    System.out.println("All Good.");
    break;
     case Failed :
     System.out.println("Try Again.");
     break;
     case Pending :
     System.out.println("Wating for a whiel");
     break;
    default:
    System.out.println("Done");
        break;
}

    }
}
