import java.util.Arrays;
class RightShift_By_k_Position 
{
	public static void rightshift(int a[],int k){
		
		int n=a.length;
		
		k = k % n;
		
		for (int j=1;j<=k ;j++ )
		{
			int last =a[n-1];
			
			for (int i=n-2; i>=0;i-- )
			{
				a[i+1]=a[i];
			}
			a[0]=last;
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		int k=3;
		
		rightshift(a,k);
		
		System.out.println(Arrays.toString(a));
		
		
	}
}
