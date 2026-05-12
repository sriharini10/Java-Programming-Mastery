class Multi_Line_Initializers_ABC 
{
	static int a=10;
	
	static
	{
		
		System.out.println("I am multi line initializer 1");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(a);
	}
	
	static
	{
		
		System.out.println("I am multi line initializer 2");
		
	}
}
