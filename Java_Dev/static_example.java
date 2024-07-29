class Mobile {
    String brand;
    int price;
    static String name; //Static variable.
    static //static block:
    {
        name="phone";
        System.out.println("in static block:");
    }
    public Mobile()
    {
        brand="";
        price=200;
        System.out.println("in constructor:");
    }
    public void show() {
        System.out.println(brand + ": " + price + ": " + name);
    }
}

public class static_example {
    public static void main(String[] args) throws ClassNotFoundException
     {
        // Mobile obj1 = new Mobile();
        // Mobile obj2 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // // obj1.name="Smarphone";

        // obj2.brand = "Sumsung";
        // obj2.price = 1700;

        // Mobile.name = "Smartphone";

        // obj1.show();
        // obj2.show();
    Class.forName("Mobile");   // At first load the class in jvm class loader. when object comes than class load but using Class.forName(className:"  ") load the class .when class load then static block also load.

        
            
}
}

