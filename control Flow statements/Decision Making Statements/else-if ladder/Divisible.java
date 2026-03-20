import java.util.Scanner;
class Divisible 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		
		if (num%3==0 && num%5==0)
		{
			System.out.println("Number is divisible by both 3 and 5");
			
		}
		else if (num%3==0)
		{
			System.out.println("Number is divisible by 3");
		}
		else if (num%5==0)
		{
			System.out.println("Number is divisible by 5");
		}
		else
		{
			System.out.println("Number is  not divisible by both 3 and 5");
		}
	}
}
