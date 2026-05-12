import java.util.Scanner;
class Fibonacci 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number:");
		int num=sc.nextInt();
		
		int previous=0, current=1, nextTerm=0;
		
		
		System.out.print("Fibonacci Series of a "+num+" is: ");
		
		
		
		for(int i=1; i<=num; i++)
		{
			System.out.print(previous +" ");
			
			nextTerm = previous + current;
			previous = current;
			current = nextTerm;
			
			
		}
		
	}
}
