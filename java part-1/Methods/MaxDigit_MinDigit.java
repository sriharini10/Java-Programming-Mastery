import java.util.Scanner;
class MaxDigit_MinDigit
{
	static Scanner sc=new Scanner(System.in);
	public static int maxDigit(int n){
		
		int maxdigit=Integer.MIN_VALUE;
		
		while(n >0){
			
			int ld = n % 10;
			
			maxdigit = Math.max(maxdigit , ld);
			
			n= n / 10;
		}
		
		return maxdigit;
		
		
	}
	public static int minDigit(int n){
		
		int mindigit=Integer.MAX_VALUE;
		
		while(n >0){
			
			int ld = n % 10;
			
			mindigit = Math.min(mindigit , ld);
			
			n= n / 10;
		}
		
		return mindigit;
		
		
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter one NUmber: ");
		int n = sc.nextInt();
		
		System.out.println("Max Digit is: "+maxDigit(n));
		System.out.println("Min Digit is: "+minDigit(n));
		
	}
}
