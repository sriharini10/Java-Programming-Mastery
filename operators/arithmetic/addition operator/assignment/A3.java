import java.util.Scanner;
class A3 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int AppleRs=50;
		System.out.println("enter quantity of apple:");
		int qtyApple=sc.nextInt();
		
		int totalApple=qtyApple * AppleRs;
		System.out.println("Apple is:" + totalApple);
		
		int BananaRs=6;
		System.out.println("enter quantity of banana:");
		int qtyBanana=sc.nextInt();
		
		int totalBanana=qtyBanana * BananaRs;
		System.out.println("banana is:" + totalBanana);
		
		int finalRs= totalApple + totalBanana;
		System.out.println(finalRs);
		
		
		
	}
}
