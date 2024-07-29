class Fruit
{
    String name;
    String taste;
    String size;
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
   public void eat()
   {
    System.out.println("Name of the Fruit is :"+name+" Which is very "+taste);
   }
}

class Apple extends Fruit
{

    public Apple(String name,  String size) {
        super(name, "Sweet", size );

    }

    @Override
    public void eat() {
        System.out.println("Name of the Fruit is :"+name+" Which is very "+taste+" and size is :"+size);
    }
}

class Orange extends Fruit
{

    public Orange(String name,  String size) {
        super(name, "Tangy", size);

    }


    @Override
    public void eat() {
        System.out.println("Name of the Fruit is :"+name+" Which is very "+taste+" and size is :"+size);
    }


}



public class Ex5 {
    public static void main(String[] args) {
        Apple apple=new Apple("Apple", "big");
        Orange orange =new Orange("Orange", "small");
        apple.eat();
        orange.eat();
    }
}
