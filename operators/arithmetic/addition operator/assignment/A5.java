import java.util.Scanner;
class A5 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter total seconds");
		int total_secs=sc.nextInt();
		
		int mins = total_secs / 60;
		
		int remaining_secs = total_secs % 60;
		
		System.out.println("minute is :" +mins);
		System.out.println("remaining seconds is :" +remaining_secs);
		
	}
}
