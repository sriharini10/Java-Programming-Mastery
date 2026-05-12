import java.util.Arrays;
class Selection_Sort 
{
	public static void main(String[] args) 
	{
		int arr[] ={5,2,7,1,8,6};
		
		int n = arr.length;
		
		for(int i=0; i<n;i++)
		{
			int minIndex = i;
			
			for(int j=i+1;j<n;j++)
			{
				if (arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			
			// swap between a[i] and arr[minIndex]
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
