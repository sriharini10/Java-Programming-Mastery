import java.util.Scanner;
class Palindrome_Number
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number: ");
		int n=sc.nextInt();      
	
		int rev=0;
		
		int temp=n;    // to store original number in another variable is important for palindrome
		
		
		while(n>0){
			
			int lastdigit = n % 10;     //to get last digit
			
			rev = rev * 10 + lastdigit;
			
			n = n/10;            //to remove last digit
		}
		 
		if(temp == rev){
			System.out.println("This number is palindrome ");
		}
		else{
			System.out.println("This number is not palindrome ");
		}
		
	}

}
