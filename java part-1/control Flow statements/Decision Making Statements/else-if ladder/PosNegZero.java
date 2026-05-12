import java.util.Scanner;
class PosNegZero 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number:");
		int num=sc.nextInt();
		
		if(num == 0){
			System.out.println("Zero");
		}
		else if (num > 0)
		{
			System.out.println("Positive");
		}
		else{
			System.out.println("Negative");
		}
	}
}