abstract class KFC
{
	 abstract void friedChicken();
	
}

abstract class Nexus extends KFC
{
}

class VR extends KFC
{
	@Override
	void friedChicken()
	{
		System.out.println("400rs 6 pc");
	}
}

class Restaurant
{
	public static void main(String[] args) 
	{
		VR mall = new VR();
		mall.friedChicken();
	}
}
