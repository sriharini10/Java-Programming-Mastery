class Ola
{
	String pickup;
	String drop;
	int distance;
	
	Ola(String pickup, String drop, int distance)
	{
		this.pickup = pickup;
		this.drop = drop;
		this.distance = distance;
	}
	
	void olaDetails()
	{
		System.out.println("Pickup point: " +pickup);
		System.out.println("Dropping Point: " +drop);
		System.out.println("Distance: "+distance +"km");
	}
}

class Auto extends Ola
{
	int price = 30;
	Auto(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
		System.out.println("You have selected auto");
		
		void totalCost()
		{
			System.out.println("Total price: "+price*distance);
			System.out.println("---------------------------------");
		}
		
	}
}

class Bike extends Ola
{
	int price = 20;
	Bike(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
		System.out.println("You have selected bike");
		
		void totalCost()
		{
			System.out.println("Total price: "+price*distance);
			System.out.println("---------------------------------");
		}
		
	}
}

class  SuperCall
{
	public static void main(String[] args) 
	{
		Auto a1 = new Auto("vada","Arum" ,2);
		a1.olaDetails();
		a1.totalCost();
		
		Auto a2 = new Auto("new washermenpet","Arum" ,13);
		a2.olaDetails();
		a2.totalCost();
		
		Bike b1 = new Bike("marina","n4" ,50);
		a1.olaDetails();
		a1.totalCost();
		
		
	}
}
