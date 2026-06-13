class BreaknotWorking extends RuntimeException{

    BreaknotWorking(String msg) {

        super(msg);
    }
    
}


class Bike {
    static boolean isStoppable = false;

    public static void ride(){

        System.out.println("bike is running");

        if (isStoppable) {
            System.out.println("bike is stopped");
            
        } else {
            throw new BreaknotWorking("gonee");
        }
        
    }
}

public class Custom2 {

    public static void main(String[] args) {
        
        Bike.ride();
        

    }
    
}
