import java.util.Scanner;
class Factors_Of_Num 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number:");
		int num=sc.nextInt();
		
		System.out.print("Factors of "+num+ " are: ");
		
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				System.out.print(i +" ");
			}
		}
	}
}
