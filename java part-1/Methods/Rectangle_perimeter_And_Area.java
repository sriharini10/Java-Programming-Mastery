import java.util.Scanner;
class Rectangle_perimeter_And_Area 
{
	static Scanner sc= new Scanner(System.in);
	
	public static int area(int l, int b){
		
		return l*b;
	}
	
	public static int perimeter(int l, int b){
		
		int ans = 2 * (l+b);
		return ans;
	}
	
	public static void main(String[] args)
	{
		System.out.print("Enter Length: ");
		int l =sc.nextInt();
		
		System.out.print("Enter breadth: ");
		int b =sc.nextInt();
		
		int a = area(l, b);
		
		System.out.println("Area: "+a);
		
		int p = perimeter(l,b);
		
		System.out.println("Perimeter: " +p);
	}
}
