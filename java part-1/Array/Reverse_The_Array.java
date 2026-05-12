import java.util.Arrays;
class Reverse_The_Array 
{
	
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40};
		
		System.out.print("Original array: ");
		System.out.println(Arrays.toString(arr)); //original array
		
		//reversing array
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j){
			
			int temp = arr[i];
			
			arr[i] = arr[j];
			
			arr[j] = temp;
			
			i++;
			
			j--;
		}
		
		System.out.print("Reversed array: ");
		
		System.out.println(Arrays.toString(arr)); //Reversed Array
	}
}
