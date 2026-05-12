import java.util.Scanner;
class Count_the_Digits 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one number: ");
		int n=sc.nextInt();
		
		int count=0;
		
		
		while(n>0){
			n = n/10;     //to remove last digit 
			count++;
		
	}
	System.out.println("Total Digit is: "+count);
}
}
