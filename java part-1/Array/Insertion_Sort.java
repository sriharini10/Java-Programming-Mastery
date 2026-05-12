import java.util.Arrays;
class Insertion_Sort 
{
	public static int[] insertion(int a[]){
		
		int n=a.length;
		
		for (int i=1;i<n ;i++ )
		{
			int key = a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		return a;
		
	}
	public static void main(String[] args) 
	{
		int a[]={5,2,3,1,4};
		
		System.out.println(Arrays.toString(insertion(a)));
	}
}
