class A  
{
	A()
	{
		System.out.println("Hii");
	}
	
	A(int a)
	{
		System.out.println("Hello");	
	}
	
	A(String a)
	{
		System.out.println("good morning");
	}
	
	A(String a, int b)
	{
		System.out.println("good afternoon");
	}
	
	A(int a,String b)
	{
		System.out.println("good night");
	}
	
	public static void main(String[] args) 
	{
		A ob = new A();
		A ob1 = new A(2);
		A ob2 = new A("str");
		A ob3 = new A("str",9);
		A ob4 = new A(7,"str");
		
	}
}
