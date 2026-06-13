
public class MultipleTryCatch {

    public static void main(String[] args) {

        System.out.println("start");

        int arr[] ={2,3,4,5,6};

        String s = null;

        try {
            System.out.println(30/0);
        } 
        catch (ArithmeticException e) {
            System.out.println("exception1 is handled");
        }
        
        try {
            System.out.println(s.toLowerCase());
        } 
        catch (NullPointerException e) {
            System.out.println("exception2 is handled");
        }
        
        try {
            System.out.println(arr[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception3 is handled");
        }
        System.out.println("end");


    }
    
}
