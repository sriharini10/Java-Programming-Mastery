import java.util.Arrays;
class SortColours012 
{
	public static void sort012(int a[]){
		int i=0;
		int j= a.length-1;
		int k=0;
		
		while (k<=j)
		{
			if(a[k]==1)
			{
				k++;
			}
			else if (a[k]==2)
			{
				int temp=a[k];
				a[k]=a[j];
				a[j]=temp;
				j--;
			}
			else
			{
				int temp=a[k];
				a[k]=a[i];
				a[i]=temp;
				i++;
				k++;
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]={1,2,0,1,0,2,1};
		
		sort012(a);
		
		
		System.out.print(Arrays.toString(a));
		
	}
}
