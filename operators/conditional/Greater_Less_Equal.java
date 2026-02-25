import java.util.Scanner;
class Greater_Less_Equal
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr first num:");
		int n1= sc.nextInt();
		System.out.println("Enetr second num:");
		int n2= sc.nextInt();
		
		String ans =  (n1==n2) ? "Equal": (n1>n2) ? " num1 is greater" : "num2 is greater";
		
		System.out.println(ans);
	}
}
