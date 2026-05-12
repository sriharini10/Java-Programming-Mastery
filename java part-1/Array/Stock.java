class Stock 
{
	public static void maxprofit(int a[]){
		
		int maxprofit=0;
		
		int n=a.length;
		
		for (int i=0; i<n-1 ;i++ )
		{
			for (int j=i+1; j<n ; j++ )
			{
				int profit = a[j] - a[i];
				
				maxprofit=Math.max(profit,maxprofit);
				
				
				
			}
		}
		System.out.println("Maximum profit is: " + maxprofit);
		
	}
	public static void main(String[] args) 
	{
		int a[]={7,1,5,3,6,4};
		
		maxprofit(a);
	}
}
