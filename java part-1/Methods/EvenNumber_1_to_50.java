import java.util.Scanner;
class EvenNumber_1_to_50
{
	static Scanner sc = new Scanner(System.in);
	public static boolean isEven(int n){
	
			 if(n%2 ==0){
				 
				 return true;
				
			 }
			 return false;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Even numbers between 1 to 50 are :  ");
		
		for(int i=1; i<=50; i++){
			
			boolean ans = isEven(i);
			
		    if(ans){
				
				System.out.println(i);
				
			}
			
		}
		
		
	}
}
