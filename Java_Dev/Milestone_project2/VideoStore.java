import java.util.List;
import java.util.ArrayList;

public class VideoStore {
    private List<Video> stroe;

    public VideoStore() {
        stroe = new ArrayList<>();
    }

    public void addVideo(String name) {
        stroe.add(new Video(name));
        System.out.println("Video '"+name+"' added successfully.");
    }

    public void doCheckout(String name) {
        for (Video video : stroe) {
            {
                if (video.getName().equals(name)) {
                    video.doCheckout();
                    System.out.println("Video '"+name+"'checked out successfully.");                      
                           
                    break;
                }
            }
        }
    }

    public void doReturn(String name) {
        for (Video vedio : stroe) {
            if (vedio.getName().equals(name)) {
                vedio.doReturn();
                System.out.println("Video '"+name+"'return successfully.");  
                break;
            }
        }
    }

    public void reciveRating(String name, int rating) {
        for (Video vedio : stroe) {
            if (vedio.getName().equals(name)) {
                vedio.reciveRating(rating);
                System.out.println("Rating '"+rating+"'has been mapped to the Video: '"+name+"'");  
               break;
            }
        }
    }

    public void listinventory() {
        for (Video vedio : stroe) {
                System.out.println("Video Name: " + vedio.getName() + ", Checked Out: " + vedio.getCheckout() + ", Rating: "
                    + vedio.getRating());
                    
        
    }
}
}