class Kadane_Algorithm 
{
	public static void maxSum(int a[]){
		
		int sum =0;
		int maxsum=Integer.MIN_VALUE;
		
		for (int i=0;i<a.length ;i++ )
		{
			sum = sum + a[i];
			maxsum = Math.max(sum,maxsum);
			
			if (sum <0)
			{
				sum=0;
			}
		}
		System.out.println("Maximum sum is: " +maxsum);
	}
	public static void main(String[] args) 
	{
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		
		maxSum(a);
	}
}
