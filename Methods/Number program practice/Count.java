import java.util.Scanner;
class Count 
{
	static Scanner sc=new Scanner(System.in);
	
	public static int count(int n){
		int c = 0;
		while(n>0){
			int ld = n%10;
			c++;
			n=n/10;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one Number: ");
		int n=sc.nextInt();
		
		int ans = count(n);
		System.out.println(ans);
		
	}
}
