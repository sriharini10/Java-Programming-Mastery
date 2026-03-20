import java.util.Scanner;
class Swiggy 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t \t \t Welcome To Swiggy Application");
		
		System.out.println("1.SS Hyderabad Bririyani \n2.A2B \n3.Pandiyas\n");
		
		System.out.print("Select an Restaurants:");
		int restaurant=sc.nextInt();
		
		int bill=0;
		int quantity=0;
		int food=0;
		int amount=0;
		char ch;
		
		
		switch(restaurant){
			
			case 1:
				System.out.println("\t \t \t Welcome to SS Hyderabad Biriyani");
				System.out.println("\t \t \t Our Menu Card is Here:");
				System.out.println("1.Chicken Bririyani 200rs \n2.Mutton Biriyani 300rs \n3.vegetable Biriyani 100rs\n");
				
				System.out.print("Select Food From Menu Card:");
				food=sc.nextInt();
			
				
				if(food==1){
					System.out.print("Enter Quantity:");
					quantity=sc.nextInt();
					
					System.out.println("You Choose " +quantity+ " Chicken Biriyani");
					
					bill = quantity * 200;
				}	
				else if(food==2){
					System.out.print("Enter Quantity:");
					quantity=sc.nextInt();
					
					System.out.println("You Choose " +quantity+ " Mutton Biriyani");
					
					bill = quantity * 300;
				}
				else if(food==3){
					System.out.print("Enter Quantity:");
					quantity=sc.nextInt();
					
					System.out.println("You Choose " +quantity+ " Vegetable Biriyani");
					
					bill=quantity * 100;
				} 
				else{
					System.out.println("This Food Is not Available ........Please Choose Correct Food From Our Menu Card");
					break;
				}
				
				System.out.println("your bill is:" +bill);
				
				
				System.out.println("\t \t \t If you want to pay the bill just type 'y' for 'yes'  otherwise just type'n' for 'no': ");
				ch=sc.next().charAt(0);
				
				if (ch=='y' || ch=='Y')
				{
					System.out.print("Enter Amount to pay the bill:");
					amount=sc.nextInt();
					if (amount == bill)
					{
						int generateOTP=(int) (Math.random() *9000)+1000;
						System.out.println("\t \t \t Your OTP is:" +generateOTP);
					
						System.out.print("Enter Your OTP:");
						int userOTP= sc.nextInt();
						if (userOTP == generateOTP)
						{
							System.out.println("\t \t \t your order is done Sucessfully........");
						}
						else{
						System.out.println("You Entered Invalid OTP");
						}
					
					}	
					else{
						System.out.println("\t \t \t Invalid Amount.......Your Order is Cancelled");
					}
				}
				else{
					System.out.println("Payment Failed.........");
				}
				break;
				
				
			case 2:
				System.out.println("\t \t \t Welcome to A2B ");
				System.out.println("\t \t \t Our Menu Card is Here:");
				System.out.println("1.Curd Rice 55rs \n2.Parota 50rs \n3.Sambar Rice 100rs\n");
				
				System.out.print("Select Food From Menu Card:");
				food=sc.nextInt();
				
				
		
				
				if(food==1){
					
					System.out.print("Enter Quantity:");
					quantity=sc.nextInt();
				
					System.out.println("You Choose " +quantity+ " Curd Rice");
					
					bill = quantity * 55;
				}	
				else if(food==2){
					System.out.print("Enter Quantity:");
			        quantity=sc.nextInt();
				
					System.out.println("You Choose " +quantity+ " Parota");
					
					bill = quantity * 50;
				}
				else if(food==3){
					System.out.print("Enter Quantity:");
			        quantity=sc.nextInt();
				
					System.out.println("You Choose " +quantity+ " Sambar Rice");
					
					bill=quantity * 100;
				} 
				else{
					
				
					System.out.println("This Food Is not Available ........Please Choose Correct Food From Our Menu Card");
					break;
				}
				
				System.out.println("your bill is:" +bill);
				
				
				System.out.println("\t \t \t If you want to pay the bill just type 'y' for 'yes'  otherwise just type'n' for 'no': ");
				ch=sc.next().charAt(0);
				
				if (ch=='y' || ch=='Y')
				{
					System.out.print("Enter Amount to pay the bill:");
					amount=sc.nextInt();
					if (amount == bill)
					{
						int generateOTP=(int) (Math.random() *9000)+1000;
						System.out.println("\t \t \t Your OTP is:" +generateOTP);
					
						System.out.print("Enter Your OTP:");
						int userOTP= sc.nextInt();
						if (userOTP == generateOTP)
						{
							System.out.println("\t \t \t your order is done Sucessfully........");
						}
						else{
						System.out.println("You Entered Invalid OTP");
						}
					
					}	
					else{
						System.out.println("\t \t \t Invalid Amount.......Your Order is Cancelled");
					}
				}
				else{
					System.out.println("Payment Failed.........");
				}
				break;
				
		case 3:
			System.out.println("\t \t \t Welcome to Pandiyas");
				System.out.println("\t \t \t Our Menu Card is Here:");
				System.out.println("1.Masala Dosa 100rs \n2.Mini Mealss 250rs \n3.Fried Rice 150rs\n");
				
				System.out.print("Select Food From Menu Card:");
				food=sc.nextInt();
				
				
				
				
				
				if(food==1){
					System.out.print("Enter Quantity:");
			        quantity=sc.nextInt();
				
					System.out.println("You Choose " +quantity+ " Masala Dosa");
					
					bill = quantity * 100;
				}	
				else if(food==2){
					System.out.print("Enter Quantity:");
			        quantity=sc.nextInt();
				
					System.out.println("You Choose " +quantity+ " Mini Meals");
					
					bill = quantity * 250;
				}
				else if(food==3){
					System.out.print("Enter Quantity:");
			        quantity=sc.nextInt();
				
					System.out.println("You Choose " +quantity+ " Fried Rice");
					
					bill=quantity * 150;
				} 
				else{
					System.out.println("This Food Is not Available ........Please Choose Correct Food From Our Menu Card");
					break;
				}
				
				System.out.println("your bill is:" +bill);
				
				
				System.out.println("\t \t \t If you want to pay the bill just type 'y' for 'yes'  otherwise just type'n' for 'no': ");
				ch=sc.next().charAt(0);
				
				if (ch=='y' || ch=='Y')
				{
					System.out.print("Enter Amount to pay the bill:");
					amount=sc.nextInt();
					if (amount == bill)
					{
						int generateOTP=(int) (Math.random() *9000)+1000;
						System.out.println("\t \t \t Your OTP is:" +generateOTP);
					
						System.out.print("Enter Your OTP:");
						int userOTP= sc.nextInt();
						if (userOTP == generateOTP)
						{
							System.out.println("\t \t \t your order is done Sucessfully........");
						}
						else{
						System.out.println("You Entered Invalid OTP");
						}
					
					}	
					else{
						System.out.println("\t \t \t Invalid Amount.......Your Order is Cancelled");
					}
				}
				else{
					System.out.println("Payment Failed.........");
				}
				break;
		 default:
			 System.out.println("You didn't  ..... choose anything.....");
			
		}
		
	}
}
