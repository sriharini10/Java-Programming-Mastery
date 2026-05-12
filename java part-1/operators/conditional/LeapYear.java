import java.util.Scanner;
class LeapYear
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enetr a Year:");
		int year= sc.nextInt();
		
		
		String ans =  year%100==0 ? year%400==0 ? "leap Year":"Not a leap year" : year%4==0 ? "leap year" : "not a leap year";
		
		System.out.println(ans);
	}
}
