import java.util.Scanner;
class Power 
{
	static Scanner sc= new Scanner (System.in);
	
	public static int power(int base, int p ){
		
		int mul=1;
		
		for(int i = 1; i<=p ; i++){
			
			mul = mul * base;
			
		}
		return mul;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the base value: ");
		int base= sc.nextInt();
		
		System.out.print("Enter the power value: ");
		int p =sc.nextInt();
		
		int ans = power(base , p);
		
		System.out.println(ans);
	}
}
