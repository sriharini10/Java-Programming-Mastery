class Indravarma
{
	void aboutIndravarma()
	{
		System.out.println("I am useless, i am fully dependent on bheem");
	}
}

class Raju extends Indravarma
{
	void aboutRaju()
	{
		System.out.println("I have 2 hairs");
	}
}

class Chutki extends Indravarma
{
	void aboutChutki()
	{
		System.out.println("I give laddu to bheem");
	}
}


class Dholu extends Indravarma
{
	void aboutDholu()
	{
		System.out.println("I do whatever kalia tells");
	}
}


class Bholu extends Indravarma
{
	void aboutBholu()
	{
		System.out.println("I do whatever dholu does");
	}
}


class Dholakpur
{
	public static void main(String[] args) 
	{
		
		Chutki c = new Chutki();
		c.aboutChutki();
		c.aboutIndravarma();
		
		Indravarma i = new Chutki();
		i.aboutIndravarma();
		
		Indravarma i1 = new Raju();
		i1.aboutIndravarma();
		
		Indravarma i2 = new Dholu();
		i2.aboutIndravarma();
		
		Indravarma i3 = new Bholu();
		i3.aboutIndravarma();
	}
}
