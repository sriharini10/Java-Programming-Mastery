class Sorted_Or_Not
{
	public static boolean isSorted(int arr[]){
		
		for(int i=0;i<arr.length -1 ;i++){
			
			 if(arr[i] > arr[i+1]){
				 return false;
				
			 } 
		}
		return true;		
		
	}
			
	
	public static void main(String[] args) 
	{
		int arr[]={2,3,5,10,4};
		
		boolean sort = isSorted(arr);
		
		if(sort){
			System.out.println("Array is sorted");
		}
		else{
			System.out.println("Array is not sorted");
			
		}
	}
}
