import java.util.Scanner;
class Grade 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Your marks:");
		int marks=sc.nextInt();
		
		if (marks >= 90)
		{
			System.out.println("Your grade is A");
		}
		else if (marks >= 75)
		{
			System.out.println("Your grade is B");
		}
		else if (marks >= 65)
		{
			System.out.println("Your grade is c");
		}
		else if (marks >= 35)
		{
			System.out.println("Your grade is D");
		}
		else 
		{
			System.out.println("Your Are Fail");
		}
	}
}
