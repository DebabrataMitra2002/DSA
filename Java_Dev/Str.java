public class Str {
    public static void main(String[] args) {
        // String name= new String();
        // name ="Debo";
        // System.out.println("Hello "+name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(2));
        // System.out.println(name.compareTo("Debo"));
        // String s1 = "Bidisha";
        // String s2 = "Bidisha";
        // System.out.println(s1.equals(s2));
        // System.out.println(s1==s2);
        // String n1 = new String("dog");//String object is create in heap memory:
        
        // String n2 = "dog"; // String Object is create in String constant pool:
        // String n3 = new String("dog").intern();// String Object is create in String constant pool:
        // System.out.println(n1==n2);
        // System.out.println(n3==n2);
        // System.out.println(n1==n3);
        // StringBuffer n4 = new StringBuffer("dog");
        // StringBuffer n5 = new StringBuffer("dog");
        
        // System.out.println(n4);
        // System.out.println(n4==n5); // String object are create differently: that's why the output is false.
        byte[] b_arr = {71, 101, 101, 107, 115};
        String s_byte =new String(b_arr);
        System.out.println(s_byte);

    }
}
