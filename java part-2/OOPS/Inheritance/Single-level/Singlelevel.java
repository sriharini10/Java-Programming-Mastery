class Father
{
	double money = 1000;
	String scooty = "Activa";
}


class Daughter extends Father
{
	String phone = "iphone";
	boolean hasBf = false;
}

class Singlelevel 
{
	public static void main(String[] args) 
	{
		
		Daughter d = new Daughter();
		
		System.out.println(d.phone);
		System.out.println(d.hasBf);
		System.out.println(d.money);
		System.out.println(d.scooty);
		
		Father f = new Father();
		System.out.println(f.money);
		System.out.println(f.scooty);
		//System.out.println(f.phone);   // not possible
		//System.out.println(f.hasBf);   // not possible
		
		
		
		
		
	}
}
