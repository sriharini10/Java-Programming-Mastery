class Sum_Of_All_The_Pairs
{
	public static void pairs(int a[]){
		
		int n=a.length;
		
		for (int i=0;i<n-1 ;i++ )
		{
			int sum =0;
			for (int j=i+1;j<n ;j++ )
			{
				
				sum=a[i]+a[j];
				
				
				System.out.print(sum+" ");
				
				
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		
		int a[]={1,2,3,4,5,6,7,8,9};
		
		pairs(a);
	}
}
