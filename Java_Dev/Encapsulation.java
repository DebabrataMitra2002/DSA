class Human {
    // int age;
    // String name;
    private int age = 22;
    private String name = "Debabrata";
    // public int getAge()
    // {
    // return age;
    // }
    // public String getName()
    // {
    // return name;
    // }

    // Binding data with Method is known as encapsulation.
    // directly we can not access private data, what's why we use getter and setter.

    public int getAge() {
        return age;
    }

    public void setAge(int age,Human obj) {
        obj.age = age;  // here we pass the object reference instead of using this key word. 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age=22;
        // obj.name="Debabrata";
        obj.setName("Jagannath Mitra");//we can get the value of private data using getter.
        obj.setAge(60,obj); // we can set the private variable data using setter.
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
