class Calculator 
{
	public static void addition()
	{
		System.out.println("This is addition method");
	}
	
	public static int addition(int a , int b)
	{
		System.out.println("This is addition method with two int  parameters");
		return a+b;
	}
	
	public static float addition(float a, float b)
	{
		System.out.println("This is addition method with two float parameters");
		return a+b;
	}
	
	public static void addition(int a, float b, double c)
	{
		double res = a + b +c;
		System.out.println("Mixed of Addition");
		
	}
	
	public static void main(String[] args) 
	{
		addition();
		
		int ans = addition(20,30);
		System.out.println(ans);
		
		float ans2 = addition(2.1f,3.7f);
		System.out.println(ans2);
		
		addition(2,4.6f,9.5);

		
		
	}
}
