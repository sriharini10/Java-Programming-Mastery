class Parent
{
	int money = 2000;
}

class Boy extends Parent
{
	String toy ="car";
}

class Girl extends Parent
{
	String toy = "gun";
}

class Main 
{
	public static void main(String[] args) 
	{
		Boy b = new Boy();
		Parent p = b; //upcasting
		
		Parent p1 = new Girl(); //upcasting
		
		System.out.println(p.money);
		System.out.println(p1.money);
		
		//System.out.println(p.toy); ---->not possible
		//System.out.println(p1.toy); ---->not possible
		
		
	}
}
