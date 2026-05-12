class Second_Maximum
{
	public static int secondMax(int arr[]){
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		
		int n= arr.length;
		
		for (int i=0;i<n ;i++ )
		{
			
			if(arr[i]>max){
				
				secmax=max;
				max=arr[i];
			}
			else if(arr[i]>secmax && arr[i]!=max){
				
				secmax=arr[i];
			}
		}
		return secmax;
	}
	public static void main(String[] args) 
	{
		int arr[] = {2,1,5,9,4,7,3,9};
		
		System.out.println("second maximum element is : "+secondMax(arr));
	}
}
