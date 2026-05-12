class ABC
{
	ABC()
	{
		this(10);
		System.out.println("Hii");
		
	}
	ABC(int a)
	{
		this("GM",20);
		System.out.println("Hello");
	}
	ABC(String x , int y)
	{
		System.out.println("Bye");
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		ABC ob1 = new ABC();
	}
}
