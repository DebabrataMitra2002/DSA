
enum Laptop {
    Mackbook(2000), Xpe(2200), Surface, Thinkpad(1000);

    private int price;
private Laptop() //It is default constructor.
{
    price= 700;
}
    private Laptop(int price)// It is a parametrize constructor. 
    {
        this.price = price;
System.out.println("in Laptop."); // This line print 4 times because there are 4 object in the emun.
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class EnumClass {
    public static void main(String[] args) {
       for (Laptop lap : Laptop.values()) {
        System.out.println(lap + " : "+lap.getPrice());
       }
    }
}
