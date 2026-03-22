import java.util.Scanner;
class Decimal_To_Binary 
{
	static Scanner sc=new Scanner(System.in);
	public static int convertBinary(int n){
		
		int sum =0;
		int r =1;
		
		while(n>0){
			
			int digit = n% 2;
			
			sum =sum + digit * r;
			
			n= n/2;
			
			r = r* 10;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter one Number");
		int decimal = sc.nextInt();
		
		int binary =convertBinary(decimal);
		
		System.out.println("Binary value is: "+binary);
	}
}
