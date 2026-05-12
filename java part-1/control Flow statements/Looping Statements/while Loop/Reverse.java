import java.util.Scanner;
class Reverse
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number: ");
		int n=sc.nextInt();      
	
		int rev=0;
		
		
		while(n>0){
			
			int lastdigit = n % 10;     //to get last digit
			
			rev = rev * 10 + lastdigit;
			
			n = n/10;            //to remove last digit
		}
		
		System.out.println("The reverse  of the Given Number is : " +rev);
		
	}

}
