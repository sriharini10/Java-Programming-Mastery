class Non_Static_Variable_Person
{
	int age;
	
	public static void main(String[] args) 
	{
		Non_Static_Variable_Person p1 = new Non_Static_Variable_Person();
		
		System.out.println(p1.age);
		
		p1.age = 30;
		
		System.out.println(p1.age);
		
		Non_Static_Variable_Person p2 = new Non_Static_Variable_Person();
		
		System.out.println(p2.age);
		

	}
}
