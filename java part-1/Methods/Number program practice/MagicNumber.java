import java.util.Scanner;
class MagicNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isMagic(int n){
		
		while(n>9){
			int sum=0;
			while(n>0){
				int ld=n%10;
				sum = sum+ld;
				n=n/10;
			}
			n=sum;
		}
		return n==1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter one Number: ");
		int n= sc.nextInt();
		
		if(isMagic(n)){
			System.out.println("Magic Number");
		}
		else{
			System.out.println("Not a magic number");
		}
	}
}
