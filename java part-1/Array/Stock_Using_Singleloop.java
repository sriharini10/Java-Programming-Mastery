class Stock_Using_Singleloop 
{
	public static void maxprofit(int a[]){
		
		int maxprofit=0;
		
		int min=Integer.MAX_VALUE;
		
		int n=a.length;
		
		for (int i=0; i<n-1 ;i++ )
		{
			
				min= Math.min(a[i],min);
				
				int profit = a[i] - min;
				
				maxprofit=Math.max(profit,maxprofit);
				
				
				

		}
		System.out.println("Maximum profit is: " + maxprofit);
		
	}
	public static void main(String[] args) 
	{
		int a[]={7,1,5,3,6,4};
		
		maxprofit(a);
	}
}
