class Thala
{
	
	public static Thala t;
	
	String name;
	
	Thala(String name)
	{
		this.name = name;
	}
	
	public static Thala getThala(String name)
	{
		if (t == null)
		{
			t = new Thala(name);
		}
		return t;
	}
}


class Fan
{
	public static void main(String[] args) 
	{
		Thala t1 = Thala.getThala("Dhoni");
		
		Thala t2 = Thala.getThala("Ajith");
		
		System.out.println(t1.name);
		System.out.println(t2.name);
		
	}
}
