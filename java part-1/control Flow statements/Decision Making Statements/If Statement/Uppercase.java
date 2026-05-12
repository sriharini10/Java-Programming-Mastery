import java.util.Scanner;
class Uppercase 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter any one character:");
		char ch=sc.next().charAt(0);
		
		if(ch >='A' && ch <='Z'){
			System.out.println("uppercase");
		}
		else{
			System.out.println("Not a Uppercase");
		}
	}
}
