interface Cat
{
	String name = "Leo";
	void jump();
}


class Persian implements Cat
{
	@Override
	public void jump()
	{
		System.out.println("Jumping...");
	}
}
class Abstractioneg
{
	public static void main(String[] args) 
	{
		Cat c = new Persian();
		c.jump();
		Persian p = new Persian();
		p.jump();
		System.out.println(Cat.name);
	}
}
