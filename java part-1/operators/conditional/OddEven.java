import java.util.Scanner;
class OddEven 
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr one num:");
		int n= sc.nextInt();
		
		String ans = (n%2)==0 ? "Even" : "odd";
		
		System.out.println(ans);
	}
}
