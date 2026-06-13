public class Wrapper1 {

public static void main(String[] args) {


    int a=20;
    System.out.println(a);

    
    //!Boxing for int
    Integer ob1 = Integer.valueOf(a);
    System.out.println(ob1);
    System.out.println(ob1.toString());

    byte b =10;
    System.out.println(b);

    //! Boxing for byte
    Byte ob2 = Byte.valueOf(b);
    System.out.println(ob2);
    System.out.println(ob2.toString());

    short c=30;
    System.out.println(c);

    //! Boxing for short

    Short ob3 = Short.valueOf(c);
    System.out.println(ob3);
    System.out.println(ob3.toString());
}
     

    
}
