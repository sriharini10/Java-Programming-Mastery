import java.util.Scanner;
class Binary_To_Decimal 
{
	static Scanner sc=new Scanner(System.in);
	public static int convertDecimal(int n){
		
		int sum=0;
		
		int r=1; // int i=0;
		
		while(n>0){
			
			int ld = n%10;
			sum = sum + ld *r;  //sum =sum + power(ld, i)
			n=n/10;
			
			r = r*2; // i++
			
			
		
		}
		return sum;
		
		
		
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter one Binary value: ");   //11101
		int binary =sc.nextInt();
		
		int decimal = convertDecimal(binary);
		
		System.out.println(decimal);
	}
}
