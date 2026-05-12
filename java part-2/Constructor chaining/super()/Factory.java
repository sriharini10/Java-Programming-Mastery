class Vehicle
{
	String name;
	String color;
	Vehicle()
	{
		Super();
	}
}

class Car extends Vehicle
{
	double price;
	Car()
	{
		Super();
	}
}

class Factory
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		System.out.println(c.price);
		System.out.println(c.name);
		System.out.println(c.color);
	}
}
