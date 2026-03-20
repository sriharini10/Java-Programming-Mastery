import java.util.Scanner;
class Calculator
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t \t \t calculator");
		System.out.println("1.Addition \n2.Subraction \n3.Multiplication \n4.Division");
		System.out.print("Select one option:");
		int option=sc.nextInt();
		int num1;
		int num2;
		
		switch(option){
			case 1:
				System.out.println("\t \t \t Welcome to Addition");
				System.out.println("enter first number:");
				num1=sc.nextInt();
				System.out.println("enter second number:");
				num2=sc.nextInt();
				System.out.println("Addition result is:" +(num1 + num2));
				break;
			case 2:
				System.out.println("\t \t \t Welcome to Subraction");
				System.out.println("enter first number:");
				num1=sc.nextInt();
				System.out.println("enter second number:");
				num2=sc.nextInt();
				System.out.println("Subraction result is:" +(num1 - num2));
				break;
			case 3:
				System.out.println("\t \t \t Welcome to Multiplication");
				System.out.println("enter first number:");
				num1=sc.nextInt();
				System.out.println("enter second number:");
				num2=sc.nextInt();
				System.out.println("Multiplication result is:" +(num1 * num2));
				break;
			case 4:
				System.out.println("\t \t \t Welcome to Division");
				System.out.println("enter first number:");
				num1=sc.nextInt();
				System.out.println("enter second number:");
				num2=sc.nextInt();
				System.out.println("Division result is:" +(num1 / num2));
				break;
			default:
				System.out.println("Invalid option");
				
				
		}
	}
}
