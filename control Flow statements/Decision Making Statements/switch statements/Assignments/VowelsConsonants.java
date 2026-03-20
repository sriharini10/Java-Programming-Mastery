import java.util.Scanner;
class VowelsConsonants 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter one character:");
		char ch=sc.next().charAt(0);
		
		switch(ch){
			case 'a','e','i','o','u': System.out.println("vowels in lowercase");
			                          break;
			case 'A','E','I','O','U': System.out.println("vowels in UPPERcase");
			                          break;
			default:System.out.println("consonants");
		}
	}
}
