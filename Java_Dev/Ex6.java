class Shape{
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase()
    {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape
{

    @Override
    public void draw() {
       System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
       System.out.println("Erasing Circle");
    }
   
}

class Triangle extends Shape
{

    @Override
    public void draw() {
       System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
       System.out.println("Erasing Triangle");
    }
   
}

class Square extends Shape
{

    @Override
    public void draw() {
       System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
       System.out.println("Erasing Square");
    }
   
}

public class Ex6 {
    public static void main(String[] args) {
       
        Shape c,t,s;
        c=new Circle();
        t=new Triangle();
        s=new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}
