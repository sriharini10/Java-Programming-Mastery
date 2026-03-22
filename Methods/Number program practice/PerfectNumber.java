import java.util.Scanner;
class PerfectNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isPerfect(int n){
		
		int sum=0;
		 
		for(int i=0; i<=n/2,;i++){
			
			if(n%i==0){
				
				sum=sum+i;
			}
		}
		return sum==n;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one number: ");
		int n= sc.nextInt();
		
		if(isPerfect(n)){
			System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not a Perfect Number");
		}
	}
}
