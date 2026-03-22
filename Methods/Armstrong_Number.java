import java.util.Scanner;
class Armstrong_Number 
{
	static Scanner sc = new Scanner(System.in);
	public static int power (int n, int p){
		int mul =1;
		for(int i=1 ; i<=p ; i++){
			mul = mul * n;
		}
		return mul;

		
	}
	
	
	public static int countDigits(int n){
		int count=0;
		while(n >0){
			count++;
			n=n/10;
		}
		return count;	
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Enter one number: ");
		int n = sc.nextInt();
	
		int sum=0;
		int temp =n;
		int count= countDigits(n);
		
	
		while(n >0){
			int ld = n % 10;
			
			sum = sum + power(ld ,count);
			
		   n = n/10;

		}
		if(temp == sum){
			System.out.println("ArmStrong Number");
		}
		else{
			System.out.println("Not a Armstrong Number");
		}
	}
}
