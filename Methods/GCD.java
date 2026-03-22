import java.util.Scanner;
class GCD 
{
	static Scanner sc=new Scanner(System.in);
	public static int findGCD(int a, int b){
		
		int gcd=1;
		
		int n =Math.min(a,b);
		
		for(int i=1; i<=n; i++){
			
			if(a % i ==0 && b % i==0){
				gcd= i;
			}
		}
		return gcd;
		
		
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a value: ");
		int a =sc.nextInt();
		
		System.out.print("Enter b value: ");
		int b=sc.nextInt();
		
		int ans = findGCD(a,b);
		
		System.out.println("GCD is: " +ans);
		
		
	}
}
