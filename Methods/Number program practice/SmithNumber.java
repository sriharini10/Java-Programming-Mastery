import java.util.Scanner;
class SmithNumber 
{
	static Scanner sc= new Scanner (System.in);
	public static int sumOfDigits(int n){
		int sum=0;
		
		while(n>0){
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		return sum;
	}
	
	
	public static int sumOfPrimefactors(int n){
		
		int sum=0;
		
		for(int i=2; i<=n; i++){
			
			while(n%i==0){
				
				sum =sum+sumOfDigits(i);
				n=n/i;
			}
			
		}
		return sum;
	}
		
		
	public static void main(String[] args) 
	{
		System.out.println("Enter one number: ");
		int n=sc.nextInt();
		
		if(sumOfDigits(n) == sumOfPrimefactors(n)){
			System.out.println("smith number");
		}
		else{
			System.out.println("not a smith number");
		}
	}
}
