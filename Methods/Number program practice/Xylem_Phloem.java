import java.util.Scanner;
class Xylem_Phloem 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isXylem(int n){
		
		int ld1 =n%10;
		n=n/10;
		int sum1=0;
		
		while(n>9){
			
			int digit=n%10;
			sum1 =sum1 +digit;
			n=n/10;
			
		}
		
		int sum2 =ld1 +n;
		
		System.out.println(sum2); 
		
		System.out.println(sum1); //middle digits added
		
		
		
		return sum1 == sum2;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one Number: ");
		int n=sc.nextInt();
		
		if(isXylem(n)){
			System.out.println("Xylem");
		}
		else{
			System.out.println("Phloem");
		}
	}
}
