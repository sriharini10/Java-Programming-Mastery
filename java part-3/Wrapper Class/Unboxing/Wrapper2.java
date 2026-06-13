public class Wrapper2 {

    public static void main(String[] args) {
        
        int x = 100;

        Integer ob = Integer.valueOf(x);  //boxing

        int x2 =ob.intValue(); //unboxing

        System.out.println("X2 is "+x2);
    }
    
}
