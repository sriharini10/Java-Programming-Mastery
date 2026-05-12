class Print_NonPrimes_In_Array 
{
	public static boolean isPrime(int n){
		
		int count=0;
		
		for (int i=1; i<=n ; i++ )
		{
			if (n % i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void main(String[] args) 
	{
		int arr[] = {5,10,7,9,13,18};
		
		int n=arr.length;
		
		
		for (int i=0; i<n ;i++ )
		{
			if (!isPrime(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
	}
}
