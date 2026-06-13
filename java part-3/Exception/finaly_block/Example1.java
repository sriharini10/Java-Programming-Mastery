package finaly_block;
public class Example1 {
    public static void main(String[] args) {
        
        int a=10 , b=0;

        System.out.println("start");

        try {
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a/b);
            System.out.println(a*b);
            
        } 
        catch (Exception e) {
            System.out.println("Exception is handled");
        }
        finally{
            System.out.println("I am finally block");
        }
        System.out.println("end");
    }
    
}
