import java.util.Scanner;
class Qtalk 
{
	String username;
	String email;
	int pass;
	long ph;
	
	Qtalk(String username, String email, int pass, long ph)
	{
		this.username =username;
		this.email = email;
		this.pass = pass;
		this.ph = ph;
		
	}
	
	void userDetails()
	{
		System.out.println("User name is: " +username);
		System.out.println("email id is: " +email);
		System.out.println("Password is: " +pass);
		System.out.println("Phone Number is: " +ph);
	}
	
	void login(String email, int pass)
	{
		if(this.email .equals(email) && this.pass == pass) 
		{
			System.out.println("\t\t\tLogin done successfully");
		}
		else
		{
			System.out.println("\t\t\tWrong credentials");
		}
		
	}
	
	void login(long ph, int pass)
	{
		if(this.ph == ph && this.pass == pass) 
		{
			System.out.println("\t\t\tLogin done successfully");
		}
		else
		{
			System.out.println("\t\t\tWrong credentials");
		}
			
		
	}
	
	static
	{
		System.out.println("Welcome to Qtalk Application");
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int option ;
		Qtalk user1 = null;
		
		String loginEmail;
		int loginPass;
		long loginPh;
		
		do
		{
		System.out.println("1.Sign up \n2.Login By Phone Number \n3.Login By email \n0.Exit");
		System.out.print("Enter any one Option: ");
		option = sc.nextInt();
	
		
		switch(option)
		{
			case 1:
				System.out.print("\t\tEnter your username: ");
				String signupName = sc.next();
				
				System.out.print("\t\tEnter your email: ");
				String signupEmail = sc.next();
				
				System.out.print("\t\tEnter your password: ");
				int signupPass = sc.nextInt();
				
				System.out.print("\t\tEnter your Phone Number: ");
				long signupPh = sc.nextLong();
				
				user1 = new Qtalk(signupName, signupEmail, signupPass, signupPh);
				System.out.println("\t\t\tSign up done successfully");
				break;
				
			case 2:
				System.out.print("\t\tEnter your Phone Number: ");
				loginPh = sc.nextLong();
				
				System.out.print("\t\tEnter your password: ");
				loginPass = sc.nextInt();
				
				user1.login(loginPh, loginPass);
				break;
				
			case 3:
				
				System.out.print("\t\tEnter your Email: ");
				loginEmail = sc.next();
				
				System.out.print("\t\tEnter your password: ");
				loginPass = sc.nextInt();
				
				user1.login(loginEmail, loginPass);
				break;
				
			case 0:
				System.out.print("\t\tThank u .. see u again..");
				break;
			 
				
			default:
				System.out.print("\t\t\t Wrong option");
			
			
				
				
		}
		}
		while (option!=0);
	
		
	}
}
