class Student 
{
	String sname;
	int age;
	int sid;
	
	Student(String sname , int age, int sid)
	{
		this.sname = sname;
		this.age = age;
		this.sid = sid;
		
	}
	
	void studentDetails()
	{
		System.out.println("student name is: "+sname);
		System.out.println("student age is: "+age);
		System.out.println("student id is: "+sid);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("virat",18,7);
		s1.studentDetails();
		
		System.out.println("-----------------------------------");
		
		Student s2 = new Student("Dhoni",17,9);
		s2.studentDetails();
		
	}
}
