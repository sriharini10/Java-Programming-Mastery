import java.util.Scanner;
class Prime_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number:");
		int num=sc.nextInt();
		
		int count=0;
		
		
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("It is Prime number");
		}
		else
		{
			System.out.println("It is not Prime number");
			
		}
	}
}
