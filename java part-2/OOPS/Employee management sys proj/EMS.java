import java.util.*;
class Emp
{
	String ename;
	int eid;
	double sal;
	private String dept;
	
	Emp(String ename, int eid, double sal, String dept)
	{
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
		this.dept = dept;
	}
	
	//setter method for dept
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	
	void empDetails()
	{
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(sal);
		System.out.println(dept);
		
	}
}

class Developer extends Emp
{
	String skills[] = new String[4];
	
	Developer(String ename, int eid, double sal, String dept, String[] skills)
	{
		super(ename,eid,sal,dept);
		
		for (int i=0; i<skills.length; i++ )
		{
			this.skills[i] = skills[i];
		}
	}
	
	@Override
	void empDetails()
	{
		super.empDetails();
		System.out.println(Arrays.toString(skills));
	}
}
	

class TestEngineer extends Emp
{
	String tools[] = new String[4];
	
	TestEngineer(String ename, int eid, double sal, String dept,String tools[])
	{
		super(ename,eid,sal,dept);
		
		for (int i=0; i<tools.length; i++)
		{
			this.tools[i] = tools[i];
		}
	}
	
	@Override
	void empDetails()
	{
		super.empDetails();
		System.out.println(Arrays.toString(tools));
	}
	
}

class EMS 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		int option, eid;
		String ename;
		String dept;
		double sal;
		String skills[] = new String[4];
		String tools[] = new String[4];
		Emp e1 = null;
		
		do
		{
			System.out.println("\t\t1. Create Developer Account ");
			System.out.println("\t\t2. Create test Engineer Account ");
			System.out.println("\t\t3. Display Developer Details ");
			System.out.println("\t\t4. Create Test Engineer Details ");
			System.out.println("\t\t5. Change Department");
			System.out.println("\t\t0. Exit");
			
			System.out.print("Enter one option: ");
			option=sc.nextInt();
			
			switch (option)
			{
				case 1: System.out.print("\t\tEnter your name: ");
						ename = sc.next();
						System.out.print("\t\tEnter Your id: ");
						eid = sc.nextInt();
						
						System.out.print("\t\tEnter your dept: ");
						dept = sc.nextLine();
						dept = sc.next();
						
						System.out.print("\t\tEnter your salary: ");
						sal = sc.nextDouble();
						
						System.out.println("\t\tEnter Your skills: ");
						
						for (int i=0; i<skills.length; i++ )
						{
							skills[i] = sc.next();
						}
						
						
						
						
						e1 = new Developer(ename,eid,sal,dept,skills);
						System.out.println("\t\t\t-------Your account is created---------");
						e1.empDetails();
						break;
						
				case 2: System.out.print("\t\tEnter your name: ");
						ename = sc.next();
						System.out.print("\t\tEnter Your id: ");
						eid = sc.nextInt();
						System.out.print("\t\tEnter your dept: ");
						dept = sc.next();
						System.out.print("\t\tEnter your salary: ");
						sal = sc.nextDouble();
						System.out.println("\t\tEnter Your skills: ");
						
						for (int i=0; i<tools.length; i++ )
						{
							tools[i] = sc.next();
						}
						
						e1 = new TestEngineer(ename,eid,sal,dept,tools);
						System.out.println("\t\t\t-------Your account is created---------");
						e1.empDetails();
						break;
						
				case 0: System.out.println("\t\t\t-----------Thank you-----------");
						break;
						
				default: System.out.println("Wrong option");
						break;
		
			}
		}
		while (option !=0);
		
		
		
		
		
		
		
	}
}
