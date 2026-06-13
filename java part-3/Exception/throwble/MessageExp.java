package throwble;
public class MessageExp {
    public static void main(String[] args) {
        int a[] ={10,3};
        try {
            System.out.println(a[5]);
        } 
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            
            e.printStackTrace();
        }
    }
    
}
