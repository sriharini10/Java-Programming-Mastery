import java.util.Scanner;
class Fibonacci_practice 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number:");
		int num=sc.nextInt();
		
		int a=0, b=1;
		
		
		System.out.print("Fibonacci Series of a "+num+" is: ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		
		
		for(int i=2; i<num; i++)
		{
			int c= a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
			
		}
		
	}
}
