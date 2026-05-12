class Printing_1_to_10
{
	public static void display(int n){
		
		//base case
		
		if (n==11)
		{
			return;
		}
		System.out.println(n);
		display(n+1);
	}
	public static void main(String[] args) 
	{
		display(1);
	}
}
