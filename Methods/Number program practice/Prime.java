import java.util.Scanner;
class Prime 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one Number: ");
		int n = sc.nextInt();
		
		if(n==0 || n==1){
			System.out.println("Not a prime");
			return ;
		}
		
		for(int i=2; i<n-1; i++){
			
			if(n % i == 0){
				System.out.println("Not a Prime");
				return;
			}
			
			
		}
		System.out.println("Prime");
	}
}
