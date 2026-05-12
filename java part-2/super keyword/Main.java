class A
{
	void behavoiur()
	{
		System.out.println("I can run");
	}
}

class B extends A
{
	@Override
	void behavoiur()
	{
		super.behaviour(); // calling parent class Method
		System.out.println("I can jump");
	}
}

class Main
{
	public static void main(String[] args) 
	{
		A ob = new B();
		ob.behaviour();
	}
}
