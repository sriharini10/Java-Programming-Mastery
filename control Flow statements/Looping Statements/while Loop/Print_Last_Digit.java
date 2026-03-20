import java.util.Scanner;
class Print_Last_Digit 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number: ");
		int n=sc.nextInt();
		
		
		while(n>0){
			
			int lastdigit = n % 10;     //to get last digit
			
			System.out.print(lastdigit);
			
			n = n/10;            //to remove last digit
		
	}
	
}
}
