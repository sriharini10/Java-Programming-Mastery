import java.util.Arrays;
class LeftShift_By_One_position 
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		
		//i is ging to i-1
		int n= a.length;
		
		int first=a[0];
		for (int i=1; i<n;i++ )
		{
			a[i-1] =a[i];
		}
		a[n-1]=first;
		
		System.out.println(Arrays.toString(a));
	}
}
