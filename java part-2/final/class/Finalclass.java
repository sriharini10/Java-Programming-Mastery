final class Person
{
	String name;
	int age; 
	void play()
	{
		System.out.println("can play");
	}
	
}

//class Student extends Person             //not possibke
//{}

class Finalclass 
{
	public static void main(String[] args) 
	{
		
		Student s1 = new Student();
		s1.play();     
	}
}
