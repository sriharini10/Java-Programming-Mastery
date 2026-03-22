import java.util.Scanner;
class StrongNumber 
{
	static Scanner sc = new Scanner(System.in);
	public static int factorial(int n){
		
		int fact = 1;
		 
		for(int i =1 ; i<=n; i++){
			
			fact = fact * i;
			
		}
		return fact;
	}
	
	public static void main(String[] args) 
	{
		int sum =0;
		
		System.out.print("Enter one Number: ");
		int n= sc.nextInt();
		
		int temp =n;
		
		while (n>0)
		{
			int ld = n% 10;
			
			sum = sum + factorial(ld);
			
			n = n/10;
		}
		if(sum == temp){
			System.out.println("It is Strong Number");
		}
		else{
			System.out.println("It is not a Strong Number");
		}
		
		
		
	}
}
