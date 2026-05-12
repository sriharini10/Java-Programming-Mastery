class  Traversing_Array_From_Last
{
	public static void main(String[] args) 
	{
		int arr[] ={10,5,8,7,50};
		
		System.out.println("Traversing the array from last:  ");
		
		for(int i =arr.length - 1; i>=0 ; i--){
			
			System.out.println(arr[i]);
		}
	}
}
