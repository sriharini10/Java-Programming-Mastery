import java.util.Scanner;
class Circle
{
	static Scanner sc = new Scanner();
	
	public static void area(double PI, int r)
	{
		double ans = PI * r * r;
		SSystem.out.println("Area of circle is : "+ans);
	}
	
	public static void periMeter(double PI, int r)
	{
		double ans = 2* PI * r ;
		System.out.println("Perimeter of circle is : "+ans);
	}
	
	public static void main(String[] args)
	{
		final double PI = 3.14;
		
		System.out.prinlt("Enter value of r for circle: ");
		int r = sc.nextInt();
		
		area(PI, r);
		periMeter(PI, r);
	}
	
	
}