class A
{
	void m1(int a, int b)
	{
		System.out.println("hii");
	}
	
	void m1(float a, float b)
	{
		System.out.println("helloo");
	}
	
	void m1(double a, double b)
	{
		System.out.println("byee");
	}
		
}

class B
{
	void m2(float a, double b)
	{
		System.out.println("gm");        //
	}
	
	void m2(double a, float b)
	{
		System.out.println("gn");
	}
}



class TypePromotion 
{
	public static void main(String[] args) 
	{
		A ob = new A();
		ob.m1(20,30);
		
		
		B ob1 = new B();
		ob.m2(5,6);
		
	}
}
