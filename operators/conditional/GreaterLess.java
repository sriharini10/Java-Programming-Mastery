import java.util.Scanner;
class GreaterLess 
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr two num:");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		String ans = (n1>n2) ? n1+" greater" : n2+" greater";
		
		System.out.println(ans);
	}
}
