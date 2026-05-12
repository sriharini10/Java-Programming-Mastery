class Multi_Line_Initializers_Eg2 
{
	
	static int a;
	
	static String s;
	
	static
	{
		System.out.println("hiii");
		System.out.println(a);
		a=30;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(a);
		System.out.println(s);
	}
	static
	{
		System.out.println("hello");
		System.out.println(a);
		System.out.println(s);
		a=60;
		s = "Good Morning";
		
	}
	
}
