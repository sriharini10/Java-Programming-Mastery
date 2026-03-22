import java.util.Scanner;
class AddPrime 
{
	static Scanner sc = new Scanner(System.in);
	public static boolean isPrime(int n){
		
		int count =0;
		for(int i =1; i<=n; i++){
			
			if(n%i == 0){
				count++;
				
			}
			
		}
		if(count==2){
			return true;
		}
		return false;
		
		
	}
	
	public static void main(String[] args) 
	{
		int sum=0;
		
		System.out.print("Enter one Number: ");
		int n=sc.nextInt();
		
		while(n>0){
			
			int ld=n%10;
			
			if(isPrime(ld)){
				sum =sum +ld;
				
			}
			n=n/10;
		}
		System.out.println("Sum of Prime Digits is : " +sum);
	}
}
