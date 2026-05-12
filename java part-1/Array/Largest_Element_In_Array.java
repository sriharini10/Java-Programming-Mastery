class Largest_Element_In_Array 
{
	public static void main(String[] args) 
	{
		int arr[] = {5,2,6,3,10,8,7};
		
		int largest = Integer.MIN_VALUE;
		
		int n = arr.length;
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i] >largest){
				
				largest =arr[i];
				
			}
				
				
		}
		
		System.out.println("The largest element in the array is: " +largest);
		
		
	}
}
