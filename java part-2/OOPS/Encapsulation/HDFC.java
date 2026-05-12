import java.util.Scanner;
class Account
{
	
	//states
	
	String userName;
	long accountNo;
	private double balance = 1500;
	static String IFSC = "HDFC00102345";
	long phNo;
	private int pin;
	
	Account(String userName, long phNo, int pin)
	{
		this.userName = userName;
		this.phNo = phNo;
		this.pin = pin;
		this.accountNo = generateAccountNo();
		
	}
	
	long generateAccountNo()
	{
		long no = (long) (Math.random() * 9000000) +1000000;
		
		return no;
	}
	
	//getter method for balance
	
	public double getBalance()
	{
		return balance;
	}
	
	
	
	//setter method for pin
	
	public void setPin(int pin)
	{
		this.pin = pin;
		System.out.println("\t\t\tpin has updated......");
						
	}
	
	//getter method for pin
	
	public int getPin()
	{
		return pin;
	}
	
	//getter method for username
	
	public String getUserName()
	{
		return userName;
	}
	
	//getter method for accountNo
	
	public long getAccountNo()
	{
		return accountNo;
	}
	
	//getter method for phNo
	
	public long getPhNo()
	{
		return phNo;
	}
	
	
	//behaviours
	
	void deposit(double amount)
	{
		balance += amount;
		
		System.out.println("\t\t\tDeposit done successfully..");
		
	}
	void withdrawl(double amount)
	{
		if (balance >= amount)
		{
			balance -= amount;
			System.out.println("\t\t\twithdrawl done successfully..");
		}
		else
		{
			System.out.println("\t\t\tInsufficient balance");
		}
		
	}
	
	
	
		
}


class  HDFC
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int option;
		
		String userName;
		long phNo;
		int pin;
		Account a1 = null;
		double amount;
		int userpin;
		
		do
		{
		System.out.println("1.Create Account \n2.Check Balance \n3.deposit \n4.Withdrawl \n5.Change Pin \n6.Display userdetails  \n0.Exit");
		
		System.out.println("Enter any one option: ");
		
		option = sc.nextInt();
		
			switch(option)
			{
				case 1: System.out.print("\t\tEnter your name: ");
						userName =sc.next();
						System.out.print("\t\tEnter your phone number: ");
						phNo = sc.nextLong();
						System.out.print("\t\tEnter your pin: ");
						pin = sc.nextInt();   
					
						a1 = new Account(userName,phNo,pin);
						break;
				
				case 2: System.out.println( a1.getBalance() );
						break;
						
				case 3: System.out.print("\t\tEnter deposit amount: ");
						amount=sc.nextDouble();
						a1.deposit(amount);
						break;
						
				case 4: System.out.print("\t\tEnter withdrawl amount: ");
						amount =sc.nextDouble();
						a1.withdrawl(amount);
						break;
						
				case 5: System.out.print("\t\tEnter your new pin: ");
						pin=sc.nextInt();
						a1.setPin(pin);
						System.out.println("\t\t\tYour updated pin is: "+a1.getPin() );
						break;
						
				case 6: System.out.println("\t\t\t user details");
						System.out.println(a1.getUserName());
						System.out.println(a1.getAccountNo());
						System.out.println(a1.getPhNo());
						break;
				
				
						
				case 0: System.out.println("\t\t\tThank you");
						break;
					
			
				
			}
		}
		while (option !=0);
		
		
	}
}