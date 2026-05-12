import java.util.Scanner;
class BinaryToDecimal 
{
	static Scanner sc=new Scanner(System.in);
	public static int finddeci(int n){
		
		int sum=0;
		int r =1;
		
		while(n>0){
			int ld = n%10;
			sum= sum +ld*r;
			n=n/10;
			r=r*2;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one binary value: ");
		int n =sc.nextInt();
		
		System.out.println("DEcimal value is: "+finddeci(n));
	}
}
