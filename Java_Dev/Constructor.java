class Human
{
private int age;
private String name;


public Human()  //defult Constructor:
{  
    age=12;
    name="Debo";
    System.out.println("in defult constructor:");
}


public Human(int age,String name)//Parameterized Constructor:
{
this.age=age;
this.name=name;
System.out.println("in parameterize constructor:");
System.out.println(name+" : "+age);
}


public int getAge() {
    return age;
}


public void setAge(int age) {
    this.age = age;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}




}
public class Constructor 
{
    public static void main(String[] args) 
    {
         Human h =new Human();
        // Human h=new Human(34,"Debabrata");
        // h.setAge(23);
        // h.setName("dola");
        System.out.println(h.getName()+" : "+h.getAge());

    }
}
