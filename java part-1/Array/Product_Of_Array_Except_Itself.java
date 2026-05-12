import java.util.Arrays;
class Product_Of_Array_Except_Itself
{
	public static void productArray(int a[]){
		
		int n = a.length;
		
		int prefix[] = new int[n];
		int suffix[] = new int[n];
		int ans[] = new int[n];
		
		prefix[0] = 1;
		suffix[n-1] = 1;
		
		
		for (int i=1; i<n ;i++ )
		{
			prefix[i] = prefix[i-1] * a[i-1];
		}
		
		for (int i=n-2; i>=0; i-- )
		{
			suffix[i] = suffix[i+1] * a[i+1];
		}
		
		for (int i=0; i<n ; i++ )
		{
			ans[i] = prefix[i] * suffix[i];
		}
		
		System.out.println("Original array: " +Arrays.toString(a));
		System.out.println("prefix array: " +Arrays.toString(prefix));
		System.out.println("suffix array: " +Arrays.toString(suffix));
		System.out.println("Answer array: " +Arrays.toString(ans));
		
		
	}

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		
		productArray(a);
		
	}
}
