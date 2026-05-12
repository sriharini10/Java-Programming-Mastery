import java.util.Scanner;
class Xylem_Phloem
{
	/* add the first digit and last digit get sum1
	add the middle digits get sum2
	if sum 1 and sum2 is same print Xylem wlse phloem 
	
	eg : 12326  
	
	sum1=1+6 =7
	
	sum2=2+3+2=7
	
	 it is xylem */
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter One Number: ");
		int n =sc.nextInt();
		
		int lastdigit = n % 10;
		n = n/10;
		
		int sum1 =0;
		
		while (n>9)
		{
			int digit = n % 10;
			
			sum1 = sum1 + digit;
			
			n = n/10;
		}
		//System.out.println(sum);   --> for adding middle digits
		
		//System.out.println(n)      --> for first digit
		
		int sum2 = lastdigit + n;
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		if(sum1 == sum2){
			System.out.println("Xylem");
		}
		else{
			System.out.println("Phloem");
		}
	}
}
