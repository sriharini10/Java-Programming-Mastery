import java.util.Scanner;
class AddEven
{
	static Scanner sc = new Scanner(System.in);
	public static boolean isEven(int n){
	
			 if(n%2 ==0){
				 
				 return true;
				
			 }
			 return false;
	}

	
	public static void main(String[] args) 
	{
		int sum=0;
		
		System.out.print("Enter one number: ");
		int n=sc.nextInt();
		
		while(n>0){
			
			int ld=n%10;
			
			if(isEven(ld)){
				
				sum =sum+ld;
				
			}
			
			n = n/10;
			
		}
		System.out.println("Sum of Even Digits: "+sum);
		
		
	}
}
