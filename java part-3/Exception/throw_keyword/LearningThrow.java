
import java.util.Scanner;

public class LearningThrow
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println("enter your age: ");
        int age =sc.nextInt();

        if (age>=21) {
            System.out.println("you can ride bike");
            
        } else {
            throw new ArithmeticException("You cant ride bike");
        }
    }
}