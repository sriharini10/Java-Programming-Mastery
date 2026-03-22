import java.util.Scanner;
class Fibonacci 
{
	static Scanner sc=new Scanner(System.in);
	 
	public static void main(String[] args) 
	{
		System.out.print("Enter one Number: ");
		int n=sc.nextInt();
		
		int previous=0, current=1;
		
		System.out.println("Fibonacci : ");
		
		for (int i=0; i<n; i++ )
		{
			System.out.println(previous +" ");
			
			int next =current +previous;
			previous =current;
			current=next;	
		}
	}
}
