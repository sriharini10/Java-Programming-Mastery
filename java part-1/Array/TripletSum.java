class TripletSum 
{
	public static boolean threesum(int a[],int target)
	{
		
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=i+1; j<a.length ;j++ )
			{
				for (int k=j+1; k<a.length ; k++ )
				{
					if (a[i] + a[j] + a[k] == target )
					{
						return true;
					}
					
				}
				
			}
			
			
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int a[]={4,6,9,8,5};
		
		int target=19;
		
		System.out.println(threesum(a,target));
	}
}
