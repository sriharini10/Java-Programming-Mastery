class Sum_Of_SubArray 
{
	public static void subarray(int a[]){
		
		int n= a.length;
		
		for (int i=0; i<n; i++ )
		{
		
			for (int j=i; j<n; j++ )
			{
				int sum =0;
				
				for (int k=i; k<=j ;k++ )
				{
					sum = sum +  a[k];
					
				}
				System.out.println("Sum is: "+sum);
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		
		subarray(a);
		
		
	}
}
