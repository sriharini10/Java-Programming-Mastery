import java.util.Scanner;
class  Automorphic_Number

/* Any Natural Number whose square ends with the same digits as the original number itself 
			eg: original Number 25
			
			square of 25 =625 
			
			625 end with original number 25
			
			so it is automorphic number */

{
	static Scanner sc=new Scanner(System.in);
	public static boolean isAutomorphic(int n){
		
		int sq = n * n;
		
		while(n>0){
			
			int ld1 = n/10;
			
			int ld2 = sq/10;
			
			if(ld1 != ld2){
				return false;
			}
			 
			n = n/10;
			sq = sq/10;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter one number: ");
		int n = sc.nextInt();
		
		boolean ans = isAutomorphic(n);
		
		if(ans){
			System.out.println("It is Automorphic Number");
		}
		else{
			System.out.println("It is not a Automorphic Number");
		}
		
	}
}
