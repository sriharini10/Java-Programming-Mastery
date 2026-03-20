import java.util.Scanner;
class Login 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t \t \t Welcome to my Login Application");
		long regno=9876543210L;
		
		System.out.print("Enter your phone number:");
		long phno=sc.nextLong();
		
		System.out.println("\t\t\t processing..........");
		Thread.sleep(2000);
		
		
		if(regno == phno){
			
			int generatedOtp=(int) (Math.random() * 9000)+1000;
			System.out.println("\t \t \t your OTP is :" +generatedOtp);
			
			
			System.out.print("enter otp:");
			int userOtp=sc.nextInt();
			
			System.out.println("\t\t\t processing..........");
			Thread.sleep(2000);
			
			if(generatedOtp == userOtp){
				System.out.println("\t \t \t Login done uccessfully");
			}
			
			else{
				System.out.println("\t \t \t invalid Otp");
			}
			
		}
		else{
			System.out.println("\t \t \t wrong credentials");
		}
		
	}
}
