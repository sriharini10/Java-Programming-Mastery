class Bird
{
	void fly()
	{
		System.out.println("I can fly");
	}
}

interface Fish
{
	void swim();
	
}

interface Animal
{
	void jump();
}

class SuperHero extends Bird implements Animal,Fish 
{
	@Override
		public void swim()
		{
			System.out.println("I can swim");
		}
		
		@Override
			public void jump()
		{
			System.out.println("i can jump");
		}
		void run()
		{
			System.out.println("i can run");
		}
}
class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		SuperHero stromLeap = new SuperHero();
		stromLeap.jump();
		stromLeap.swim();
		stromLeap.fly();
		stromLeap.run();
	}
}
