import java.util.Arrays;
class LefttShift_By_k_Position_Using_Single_Loop

{
	public static void leftshift(int a[],int b[],int k){
		
		int n=a.length;
		
		for (int i=0; i<n; i++ )
		{
			b[(i+n-k)%n]=a[i];
		}
		
		
	}
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		
		int b[] = new int[a.length];
		int k=3;
		
		leftshift(a,b,k);
		
		System.out.println(Arrays.toString(b));
		
		
	}
}
