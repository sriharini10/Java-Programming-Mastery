import java.util.Scanner;
class DecimalToBinary 
{
	static Scanner sc=new Scanner(System.in);
	public static int finddeci(int n){
		
		int sum=0;
		int r =1;
		
		while(n>0){
			int ld = n%2;
			sum= sum +ld*r;
			n=n/2;
			r=r*10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one dicimal value: ");
		int n =sc.nextInt();
		
		System.out.println("binary value is: "+finddeci(n));
	}
}
