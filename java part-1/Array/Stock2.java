class Stock2 
{
	public static void maxprofit(int a[]){

		
		int n=a.length;
		int profit=0;
		
		for (int i=0; i<n-1 ;i++ )
		{
				
				if (a[i+1] > a[i])
				{
				  profit  += a[i+1] - a[i];
				}

		}
		System.out.println("Maximum profit is: " +profit);
		
	}
	public static void main(String[] args) 
	{
		int a[]={7,1,5,3,6,4};
		
		maxprofit(a);
	}
}
