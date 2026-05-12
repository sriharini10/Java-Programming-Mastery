import java.util.Scanner;
class Palindrome
{
	static Scanner sc=new Scanner(System.in);
	
	public static boolean isPalindrome(int n){
		int rev=0,temp=n;
		
		while(n>0){
			int ld = n%10;
			rev = rev*10+ld;
			n=n/10;
		}
		return temp==rev;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter one Number: ");
		int n=sc.nextInt();
		
		boolean ans = isPalindrome(n);
		
	
		if (ans)
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}

		
	}
}
