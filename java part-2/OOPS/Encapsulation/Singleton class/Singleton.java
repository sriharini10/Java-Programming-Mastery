class Principaal
{
	public static Principaal p;
	
	private Principaal()
	{
		
	}
	
	public static Principaal getPrincipaal()
	{
		if (p == null)
		{
			p = new Principaal();
		}
		return p;
	}
}


class Singleton
{
	public static void main(String[] args) 
	{
		Principaal p1 = Principaal.getPrincipaal();
		System.out.println(p1);
		
		Principaal p2 = Principaal.getPrincipaal();
		System.out.println(p2);
		
		Principaal p3 = Principaal.getPrincipaal();
		System.out.println(p3);
	}
}
