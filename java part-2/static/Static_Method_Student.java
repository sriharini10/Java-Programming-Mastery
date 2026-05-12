class Static_Method_Student 
{
	public static void listen()
	{
		System.out.println("We are not listening");
	}
	public static void main(String[] args) 
	{
		System.out.println("Student class");
		listen();
		
		Static_Method_Student.listen();
		
		Static_Method_Student s1 = new Static_Method_Student();
		
		s1.listen();
		
	}
}
