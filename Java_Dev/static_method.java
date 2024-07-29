class Mobile {
    String brand; //instance variable
    int price;    
    static String name;// static variable

    public void show() //it is an instance method:
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
//    static void show1()  //that gives error because instance variable not working with static method .there are many object can instantiated by class ,but in case of static it is constant ,if one object change the value than the value of other object will be change.
 
//     {
//         System.out.println(brand + " : " + price + " : " + name);
//     }
    static void show1(Mobile obj)  // Add object referance.
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}

public class static_method {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=1700;
        obj1.name="SmartPhone";
        obj1.show1(obj1);
        Mobile.name="smart  Phone";
        obj1.show();
        Mobile.show1(obj1);


    }
}