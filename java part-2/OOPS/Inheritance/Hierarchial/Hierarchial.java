class Animal
{
	void eat()
	{
		System.out.println("cat eat");
	}
	
	void sleep()
	{
		System.out.println("sleeping");
	}
}


class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class Cat extends Animal
{
	void play()
	{
		System.out.println("Playing");
	}
}

class Hierarchial 
{
	public static void main(String[] args) 
	{
		Animal a1 = new Animal();
		a1.eat();
		a1.sleep();
		
		System.out.println("----------------------------");
		
		Dog d1 = new Dog();
		d1.bark();
		d1.sleep();
		d1.eat();
		
		System.out.println("----------------------------");
		
		Cat c1 = new Cat();
		c1.play();
		c1.eat();
		c1.sleep();
		//c1.bark(); //not possible
	}
}
