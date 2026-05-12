import java.util.Arrays;
class Merge_Two_Sorted_Arrays 
{
	public static void mergeSortedArrays(int a[],int b[],int c[]){
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length){
			
			if(a[i]<b[j])
			{
				c[k]=a[i];     /* instead of this 3 lines use this
									c[k++] =a[i++]*/
				i++;
				k++;
			}
			else
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		
		// a array having some elements 
		
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		
		// b array havig some elements
		
		while (j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		
		
	}
	public static void main(String[] args) 
	{
		int a[] = {4,7,10,12};
		
		int b[]= {6,8,9,11,13,15,18};
		
		int c[]= new int[a.length + b.length];
		
		mergeSortedArrays(a,b,c);
		
		System.out.println(Arrays.toString(c));
	}
}
