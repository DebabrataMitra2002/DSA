
class  Box {
    int width;
    int hight;
    int depth;
    public Box(int width,int hight,int depth)
    {
this.width=width;
this.hight=hight;
this.depth=depth;
    }
    public void getVolume()
    { int Volume=width*hight*depth;
        System.out.println("Volume of box is = "+Volume);

    }

    
}
public class CubeOfBox {
    public static void main(String[] args) {
        Box box=new Box(23, 12, 45);
        box.getVolume();
    }
}
