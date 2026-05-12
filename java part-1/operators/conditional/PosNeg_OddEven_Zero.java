import java.util.Scanner;
class PosNeg_OddEven_Zero
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr a num:");
		int n= sc.nextInt();
		
		
		String ans =  (n==0) ? "zero" : (n>0) ? (n%2==0) ? "positive Even" : "Positive Odd" : (n%2==0) ? "Negative Even" : "Negative Odd";
		
		System.out.println(ans);
	}
}
