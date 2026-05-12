class SingleNumber_Using_Bitwise 
{
	public static void main(String[] args) 
	{
		int arr[] ={4,2,3,1,1,2,4};
		
		int ans=0;
		
		for (int i=0; i<arr.length ;i++ )
		{
			ans = ans ^ arr[i];
		}
		
		System.out.println( "SingleNumber is: " +ans);
	}
}
