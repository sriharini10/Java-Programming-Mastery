import java.util.Scanner;
class LCM 
{
	static Scanner sc =new Scanner(System.in);
	public static int findLCM(int a, int b){
		
		int max = Math.max(a,b);
		int i =1;
		
		while(true){
			
			int current = max * i;
			
			if(current % a ==0 && current % b ==0){
				
				return current;
			}
			 
			i++;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter first Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter second Number:");
		int b=sc.nextInt();
		
		int lcm = findLCM(a,b);
		
		System.out.println("LCM : "+lcm);
	}
}
