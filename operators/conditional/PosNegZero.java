import java.util.Scanner;
class PosNegZero
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr one num:");
		int n= sc.nextInt();
		
		String ans = (n==0) ? "Zero" : n>0 ? "Positive" : "Negative";
		
		System.out.println(ans);
	}
}
