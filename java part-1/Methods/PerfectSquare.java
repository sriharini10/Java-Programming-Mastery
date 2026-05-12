import java.util.Scanner;
class PerfectSquare 
/*A perfect square is a number that is the square of an integer.

           eg  4 = 2 * 2 -->perfect square
		       16 = 4 * 4 -->perfect square
			   25 = 5 * 5 -->perfect square   */
			   		
		   
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isPerfectSquare(int n){
		
		for(int i=1 ;i<= n; i++){
			
			int sq = i*i;
			
			if(sq == n)
				return true;
			
			//only for optimization
			if(sq >n)
				return false;
		}
		return false;	
		
	}
	public static void main(String[] args) 
	{
	
		System.out.print("Enter one Number: ");
		int n=sc.nextInt();
		
		boolean ans =isPerfectSquare(n);
		
		
		if(ans){
			System.out.println("It is PerfectSquare");
			
		}
		else{
			System.out.println("It is not a  PerfectSquare");
		}
	}
}
