class Swap_WithoutUsing_Temp 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);
		
		a = a + b;		//a=10+20  ------ a=30, b=20
		
		b = a - b;		//a=30-20  ------ a=30, b=10	
		
		a = a - b;		//a=30-10  ------ a=20, b=10
		
		System.out.println("After Swap");
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);
		
	}
}
