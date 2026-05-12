import java.util.Scanner;
class Swap
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		
		System.out.println("Before swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		a = a+b;
		b= a-b;
		a = a-b;
		
		System.out.println("after swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}
}
