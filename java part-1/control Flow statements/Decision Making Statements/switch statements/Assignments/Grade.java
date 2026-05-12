import java.util.Scanner;
class Grade 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a character ");
		char grade= sc.next().charAt(0);
		
		switch(grade){
		
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("very good");
				break;
			case 'C':
				System.out.println("Good");
				break;
			case 'D':
				System.out.println("Pass");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			default:
				System.out.println("invalid grade");
		}
		
	}
}
