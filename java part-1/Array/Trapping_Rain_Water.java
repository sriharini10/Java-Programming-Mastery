import java.util.Arrays;
class  Trapping_Rain_Water
{
	public static void rainwater(int a[]){
		int n = a.length;
		
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = a[0];
		right[n-1] = a[n-1];
		
		int water =0;
		
		for (int i=1; i<n ;i++ )
		{
			left[i] = Math.max (left[i-1], a[i]);
		}
		
		for (int i=n-2; i>=0 ;i-- )
		{
			right[i] = Math.max(rigth[i+1],a[i]);
		}
		
		for (int i=0; i<n; i++)
		{
			water = water + Math.min(left[i],right[i]) -a[i];
		}
		
		System.out.println("Original array: "+Arrays.toString(a));
		System.out.println("Left array: "+Arrays.toString(left));
		System.out.println("Right array: "+Arrays.toString(right));
		System.out.println("total water: "+water);
		
	}
	public static void main(String[] args) 
	{
		int a[] ={0,1,0,2,1,0,1,3,2,1,2,1};
		
		rainwater(a);
	}
}
