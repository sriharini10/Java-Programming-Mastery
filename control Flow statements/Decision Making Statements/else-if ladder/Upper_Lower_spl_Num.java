import java.util.Scanner;
class Upper_Lower_spl_Num 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("lowercase");
		}
		else if (ch >='A' && ch<='Z')
		{
			System.out.println("Uppercase");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("Numbers");
		}
		else
		{
			System.out.println("Special characters");
		}
	}
}
