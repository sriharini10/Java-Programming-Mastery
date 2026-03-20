import java.util.Scanner;
class Sum_Of_Digits
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number: ");
		int n=sc.nextInt();
	
		int sum=0;
		
		
		while(n>0){
			
			int lastdigit = n % 10;     //to get last digit
			
			sum = sum + lastdigit;
			
			n = n/10;            //to remove last digit
		}
		
		System.out.println("the sum is: "+sum);
		
	}

}
