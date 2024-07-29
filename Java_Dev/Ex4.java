class Animal
{
    public void eat()
    {
        System.out.println("eating food.");
    }

    public void sleep()
    {
        System.out.println("sleeping ...");
    }

}

class Bird extends Animal
{
    public void eat()
    {
        System.out.println("bird eating seed.");
    }

    public void sleep()
    {
        System.out.println("sleeping at nest.");
    }
    public void fly()
    {
        System.out.println("birds can fly.");
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Animal an=new Animal();
        Bird bird=new Bird();
        
        an.eat();
        an.sleep();
        bird.eat();
        bird.sleep();
        (bird).fly();
    }
}
