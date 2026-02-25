class Swap_Using_Temp 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swap");
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);
		
	}
}
