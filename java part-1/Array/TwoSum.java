class TwoSum 
{
	public static boolean twosum(int a[],int target)
	{
		
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=0; j<a.length ;j++ )
			{
				if (a[i] + a[j] == target )
				{
					return true;
				}
			}
			
			
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int a[]={4,6,9,8,5};
		
		int target=11;
		
		System.out.println(twosum(a,target));
	}
}
