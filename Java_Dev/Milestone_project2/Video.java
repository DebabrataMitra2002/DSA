public class Video {
    
    private String videoName;
    private boolean checkout;
    private int rating;
    public Video(String name) 
    {
        this.videoName = name;
        this.checkout=false;
        this.rating=0;
    }
    
    public String getName()
    {
        return videoName;
    }
 
    public void doCheckout()
    {
        this.checkout=true;
    }
   
    public void doReturn()
    {
        this.checkout=false;
    }
   
    public void reciveRating(int rating)
    {
        this.rating=rating;
    }
   
    public int getRating()
    {
        return rating;
    }
   
    public boolean getCheckout()
    {
        return checkout;
    }
}
