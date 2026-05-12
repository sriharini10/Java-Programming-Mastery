import java.util.Arrays;
class CopyArray
//copy one array into another array
{
	public static void main(String[] args) 
	{
		int a[] ={25,40,35,50,90};
		
		int b[] =new int[a.length];
		
		for (int i=0;i<a.length ;i++ )
		{
			b[i] =a[i];
		}
		
		System.out.print("original array is: ");.
			
		
		System.out.println(Arrays.toString(a));
		
		
		System.out.print("copied array is: ");
		
		System.out.println(Arrays.toString(b));
	}
}
