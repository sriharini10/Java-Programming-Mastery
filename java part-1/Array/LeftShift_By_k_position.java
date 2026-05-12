import java.util.Arrays;
class LeftShift_By_k_position 
{
	public  static void leftshift(int a[],int k){
		
		int n= a.length;
		
		k = k % n;
		
		for (int j=1;j<=k ; j++)
		{
		//i is ging to i-1
		
		int first=a[0];
		for (int i=1; i<n;i++ )
		{
			a[i-1] =a[i];
		}
		a[n-1]=first;
		}
	}
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		
		int k=3;
		
		leftshift(a,k);
		
		System.out.println(Arrays.toString(a));
	}
}
