class Printing_5_to_1 
{
	public static void display(int n){
		
		//base case
		
		if (n==0)
		{
			return;
		}
		System.out.println(n);
		display(n-1);
	}
	public static void main(String[] args) 
	{
		display(5);
	}
}
