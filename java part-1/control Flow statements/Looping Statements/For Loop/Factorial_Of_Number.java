import java.util.Scanner;
class Factorial_Of_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number:");
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of a Number: " +fact);
	}
}
