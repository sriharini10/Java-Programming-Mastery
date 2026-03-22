import java.util.Scanner;
class DuckNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isDuck(int n){
		
		while(n>0){
			
			int ld=n%10;
			
			if(ld==0){
				return true;
			}
			n=n/10;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one number");
		int n=sc.nextInt();
		
		if(isDuck(n)){
			System.out.println("Duck number");
		}
		else{
			System.out.println("Not Duck Number");
		}
		
	}
}
