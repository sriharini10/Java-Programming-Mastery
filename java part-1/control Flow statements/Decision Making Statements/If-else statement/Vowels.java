import java.util.Scanner;
class Vowels 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enetr any one Character:");
		char ch=sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch== 'U'|| ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			System.out.println("It is vowels");
		}
		else{
			System.out.println("not a vowels");
		}
	}
}
