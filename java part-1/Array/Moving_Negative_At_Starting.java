class Moving_Negative_At_Starting 
{
	public static void MoveNegative(int a[]){
		
		int i=0;
		int j=a.length-1;
		
		while (i<j)
		{
			if(a[i]>=0 && a[j]>=0)
			{
				j--;
			}
			else if (a[i]<0 && a[j]<0)
			{
				i++;
			}
			else if(a[i]<0 && a[j]>=0)
			{
				i++;
				j--;
			}
			else
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
	
		
		
	}
	public static void main(String[] args) 
	{
		int a[]={10,5,-2,-5,8,-7,6};
		
		MoveNegative(a);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
