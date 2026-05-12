import java.util.Scanner;
class Swap_In_OneLine 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter first number: ");
		int a= sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b= sc.nextInt();
		
		
		//before swap
		System.out.println("a value before swap is:" +a);
		System.out.println("b value before swap is:" +b);
		
		
		//swapping in one line
		a = a + b - (b =a); 
		
		//after swap
		System.out.println("a value after swap is:" +a);
		System.out.println("b value after swap is:" +b);
		
		
		
		
	}
}
