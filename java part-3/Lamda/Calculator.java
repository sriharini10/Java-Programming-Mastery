interface Calculate
{
    void add();
}

public class Calculator {
    public static void main(String[] args) {


        //INNER CLASS

    //     class A implements Calculate{
    //     @Override
    //     public void add(){
    //         System.out.println("i am add method");
    //     }
    // }

    //     Calculate c = new A();
    //     c.add();



    //ANONYMOUS CLASS

        Calculate c = new Calculate(){
            @Override
            public void add(){
                System.out.println("this is the add method");
            }

        };

        c.add();


        

        
    }   
}








