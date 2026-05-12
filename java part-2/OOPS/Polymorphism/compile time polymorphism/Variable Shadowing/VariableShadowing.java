class Demo1
{
	int x =10;
	
	void m1()
	{
		int x=50;
		System.out.println(x);
		
	}
}

class Demo2 extends Demo1
{
	int x =20;
}

class VariableShadowing
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		System.out.println(d1.x);
		
		Demo2 d2 = new Demo2(); 
		System.out.println(d2.x);
		
		Demo1 d3 = new Demo2(); //upcasting
		System.out.println(d3.x);
		d3.m1();
		
		Demo2 d4 = (Demo2) d3; //Downcasting
		System.out.println(d4.x);
		d4.m1();
		
	}
}
