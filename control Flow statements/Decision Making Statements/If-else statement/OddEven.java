import java.util.Scanner;
class OddEven
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");
		int n= sc.nextInt();
		
		if (n%2==0)
		{
			System.out.print("It is even \n");
			System.out.print("After Multiplying with 10: "+(n*10));
		}
	    else{
			System.out.print("It is odd \n");
			System.out.print("afer Subracting with 10: " + (n-10));
	    }
	}
}

