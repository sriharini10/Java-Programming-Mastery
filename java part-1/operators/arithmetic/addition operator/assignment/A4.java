import java.util.Scanner;
class A4
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.oujt.println("enter subject1 mark:");
		int s1=sc.nextInt();
		System.out.println("enter subject2 mark:");
		int s2=sc.nextInt();
		System.out.println("enter subject3 mark:");
		int s3=sc.nextInt();
		System.out.println("enter subject4 mark:");
		int s4=sc.nextInt();
		System.out.println("enter subject5 mark:");
		int s5=sc.nextInt();
		
		int total=s1+s2+s3+s4+s5;
		System.out.println("Total marks is: " +total);
		
		int avg=total/5;
		System.out.println("average mark is: " +avg);
	}
}
