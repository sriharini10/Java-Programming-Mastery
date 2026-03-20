import java.util.Scanner;
class SpyNumber    // Sum of the digits == product of the digits    -----------> spynumber eg: 1124
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number: ");
		int n=sc.nextInt();      //1124 is spynumber
	
		int sum=0;
		int mul=1;
		
		
		while(n>0){
			
			int lastdigit = n % 10;     //to get last digit
			
			sum = sum + lastdigit;
			
			mul = mul * lastdigit;
			
			n = n/10;            //to remove last digit
		}
		
		if (sum  == mul)
		{
			System.out.println("it is Spynumber");
		}
		else{
			System.out.println("It is Not a SpyNUmber");
		}
		
	}

}
