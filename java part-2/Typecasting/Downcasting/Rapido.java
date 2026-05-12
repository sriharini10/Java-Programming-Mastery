import java.util.Scanner;
class Ride
{
	String pickup;
	String drop;
	int distance;
	String drivers[] = {"dhoni", "virat", "rahul", "rinku", "hardik", "gill", "jaddu", "pant", "iyer", "ishan"};
	
	int index = generateIndex();
	
	String driver = drivers[index];

	
	Ride(String pickup, String drop, int distance)
	{
		this.pickup = pickup;
		this.drop = drop;
		this.distance = distance;
		
	}
	
	int generateIndex()
	{
		int index = (int) (Math.random() * 10);
		return index;
	}
}


class Car extends Ride
{
	
	int price = 50;
	
	Car(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
		
	}
	void carDetails()
	{
		System.out.println("\t\t\t Your car ride details: ");
		System.out.println("Pickup is : "+pickup);
		System.out.println("Drop is : "+drop);
		System.out.println("Distance is : "+distance+ " km");
		System.out.println("\t\t\t Total price: "+(price*distance)+" Rs");
		System.out.println("\t\t\t Driver name is: "+driver);
		
	}
}


class Bike extends Ride
{
	int price = 20;
	
	Bike(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
	}
	
	void bikeDetails()
	{
		System.out.println("\t\t\t Your bike ride details: ");
		System.out.println("Pickup is : "+pickup);
		System.out.println("Drop is : "+drop);
		System.out.println("Distance is : "+distance+ " km");
		System.out.println("\t\t\t Total price: "+(price*distance)+" Rs");
		System.out.println("\t\t\t Driver name is: "+driver);
		
	}
}


class Auto extends Ride
{
	int price = 30;
	
	Auto(String pickup, String drop, int distance)
	{
		super(pickup, drop, distance);
	}
	
	void autoDetails()
	{
		System.out.println("\t\t\t Your auto ride details: ");
		System.out.println("Pickup is : "+pickup);
		System.out.println("Drop is : "+drop);
		System.out.println("Distance is : "+distance+ " km");
		System.out.println("\t\t\t Total price: "+(price*distance)+" Rs");
		System.out.println("\t\t\t Driver name is: "+driver);
		
	}
	
}


class Rapido
{
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		System.out.println("1.Auto \n2.Bike \n3.Car");
		System.out.println("Enter any one option: ");
		
		int option = sc.nextInt();
		String pickup;
		String drop;
		int distance;
		Ride r = null;
		
		switch(option)
		{
			case 1: System.out.println("Enter your pickup loction: ");
					pickup = sc.next();
					System.out.println("Enter your drop loction: ");
					drop = sc.next();
					System.out.println("Enter the distance: ");
					distance = sc.nextInt();
					
					r = new Auto(pickup, drop, distance);
					break;
			
			case 2: System.out.println("Enter your pickup loction: ");
					pickup = sc.next();
					System.out.println("Enter your drop loction: ");
					drop = sc.next();
					System.out.println("Enter the distance: ");
					distance = sc.nextInt();
					
					r = new Bike(pickup, drop, distance);
					break;
					
			case 3: System.out.println("Enter your pickup loction: ");
					pickup = sc.next();
					System.out.println("Enter your drop loction: ");
					drop = sc.next();
					System.out.println("Enter the distance: ");
					distance = sc.nextInt();
					
					r = new Car(pickup, drop, distance);
					break;
					
			default: System.out.println("Invalid option");
			
			
					
		}
		
		if (r instanceof Bike)
			{
				Bike b = (Bike) r;
				b.bikeDetails();
			}
			if (r instanceof Car)
			{
				Car c = (Car) r;
				c.carDetails();
			}
			if (r instanceof Auto)
			{
				Auto a = (Auto) r;
				a.autoDetails();
			}
		
	}
}
