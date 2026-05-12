import java.util.Scanner;
class PerfectNumber
 /* sum of all the divisors of the number (expect itself) == original number
 
  6 ---> 1,2,3,6  --> 1+ 2+ 3=6 
   
   6 is perfect number   */
{
	
	static Scanner sc= new Scanner(System.in);
	public static boolean isPerfect(int n){
		
		int sum=0;
		
		for(int i=1; i<= n/2; i++){
			
			if(n % i==0){
			
			 sum = sum + i;
			}
			
	
		}
		return sum==n;
		
	}
	

	public static void main(String[] args) 
	{
		System.out.print("Enter one Number: ");
		int n=sc.nextInt();
		
		boolean ans = isPerfect(n);
		
		if(ans){
			System.out.println("It is Perfect Number");
		}
		else{
			System.out.println("It is not a perfect Number");
		}
	}
}
