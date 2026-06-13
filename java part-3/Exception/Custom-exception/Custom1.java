// checked custom Exception

class Notstudying  extends Exception{
    Notstudying(String msg){
        super(msg);                                                                                                                 
    }
}

public class Custom1 {
    public static void school() throws Notstudying{
        int marks=30;

        if(marks>=50){
            System.out.println("Good marks");
        }
        else{
            throw new Notstudying("better luck next time");
        
        }
        
    }

    public static void main(String[] args) {
        try {
            school();
        } catch (Notstudying e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("Notstudying exception is handled");
        } 
        

    }
    
}
