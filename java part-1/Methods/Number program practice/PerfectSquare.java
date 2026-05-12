import java.util.Scanner;
class PerfectSquare 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isPerfectSq(int n){
		
		for (int i=1; i*i<=n ;i++ )
		{
		  int sq=i*i;
		  if (sq == n)
		  {
			  return true;
		  }
		  if(sq>n)
			  return false;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one number: ");
		int n=sc.nextInt();
		
		if(isPerfectSq(n)){
			System.out.println("Perfect Square");
		}
		else{
			System.out.println("Not a Perfect Square");
		}
	}
}
