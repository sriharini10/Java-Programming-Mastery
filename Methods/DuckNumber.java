import java.util.Scanner;
class DuckNumber  
	
	//If the Number contains zero ,it is ducknumber otherwise it is not a duck number

	static Scanner sc = new Scanner(System.in);
{
	
	public static boolean isDuck(int n){
		
		while(n>0){
			
			int ld = n % 10;
			
			if(ld == 0){
				return true;
			}
			n = n/10;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter one Number: ");
		int n=sc.nextInt();
		
		boolean ans = isDuck(n);
		
		
		
		if(ans){
			System.out.println("It is Duck Number");
		}
		else{
			System.out.println("It is not a Duck Number");
		}
	}
}
