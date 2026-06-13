
interface Operation{
    void multiply();
}
interface Operation2{
    void division(int a,int b);
}

interface Operation3{
    int addition(int a, int b);
}
public class Lamda {

    public static void main(String[] args) {


        //lamda expression without parameter
        
        Operation op =() ->{
            System.out.println("multiply is "+(2*6));

        };
        op.multiply();


        //lamda expression with parameter
          
        //   Operation2 op2 = (int a, int  b) 
        Operation2 op2 = (a, b) ->{

            System.out.println("divsion is "+(a/b));
        };
        op2.division(20, 5);



        //lamda expression with returntype

        Operation3 op3 = (a,b)-> a+b;      

        

        System.out.println("addition is "+op3.addition(2,3));
    }
    
}
