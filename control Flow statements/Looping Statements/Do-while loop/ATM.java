import java.util.Scanner;
class ATM 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		
		int option;
		int balance=1000;
		int pin=2004;
		long phNo=1234567890L;
		
		do{
			System.out.println("\t \t \t Welcome to An ATM");
			System.out.println("1.Display \n2.Deposit \n3.withdrawl \n4.Change Pin \n5.Exit");
			System.out.print("Enter your Option:");
			option=sc.nextInt();

		
		
		switch(option){
			
			case 1:
				System.out.println("\t \t \t Your Account Balance is:" +balance);
				break;
				
			case 2:
				System.out.print("Enter Your Amount to deposit:");
				int amount=sc.nextInt();
				balance += amount;
				System.out.println("\t \t \t Your Account Balance is:" +balance);
				break;
				
			case 3:
				System.out.println("Enter amount to withdrawl");
				int withdrawl=sc.nextInt();
				
				System.out.println("Enter Your Pin: ");
				int userpin = sc.nextInt();
				
				System.out.println("\t \t \t processing.................");
				Thread.sleep(3000);
				
				if (userpin == pin)
				{
					if (balance > withdrawl)
					{
						balance -= withdrawl;
						System.out.println("\t \t \t Your Account Balance is:" +balance);
					}
					else
					{
						System.out.println("Not Enough Balance");
					}
					break;
				}
				else{
					System.out.println("\t \t \t You entered wrong pint .....try again ........");
				}
				break;
				
				
			case 4:
				System.out.println("Enter Your Phone Number: ");
				long userphno=sc.nextLong();
				
				System.out.println("\t \t \t processing.................");
				Thread.sleep(3000);
				
				if (userphno == phNo)
				{
					int otp =(int) (Math.random() * 9000) +1000;
					System.out.println("Your otp is: "+otp);
					
					System.out.println("Enter otp: ");
					int userotp=sc.nextInt();
					
					System.out.println("\t \t \t processing.................");
					Thread.sleep(3000);
					
					if (userotp == otp)
					{
						System.out.println("Enter Your New Pin: ");
						pin=sc.nextInt();
						System.out.println("\t \t \t New pin updated successfully...");
					}
					
					else{
						System.out.println("Wrong otp....");
					}
				}
				else{
					System.out.println("Wrong phone number");
				}
				break;
				
				
				
			case 5:
				System.out.println("byeeee byeeee");
				break;
			
			default:
				System.out.println("Invalid Option...please select correct option");
				
		}
		
		} while ( option != 5);
		
	}
}
