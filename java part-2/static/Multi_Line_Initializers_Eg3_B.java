class Multi_Line_Initializers_Eg3_A 
{
	static int x = 50;
	static
	{
		System.out.println("Hii");
		x=60;
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(Multi_Line_Initializers_Eg3_B.y);
	}
	static
	{
		System.out.println(x);
		System.out.println("helloo");
		
	}
}



class Multi_Line_Initializers_Eg3_B  
{
	static int y =500;
	
	static 
	{
		System.out.println("Good Morning");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	static 
	{
		System.out.println(y);
		y=1000;
	}
}
