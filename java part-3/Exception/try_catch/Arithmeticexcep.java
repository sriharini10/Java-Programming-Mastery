

public class Arithmeticexcep {
    public static void main(String[] args) {
        int a=30, b=0;
        System.out.println("start");
        System.out.println(a+b);
        try {
            System.out.println(a/b);
            
        } 
        catch (ArithmeticException e) {
            System.out.println("your problem i have solved");
        }
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println("end");

    }
    
}
