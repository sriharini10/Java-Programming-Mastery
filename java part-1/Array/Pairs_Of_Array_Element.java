class Pairs_Of_Array_Element
{
	public static void pairs(int a[]){
		
		int n=a.length;
		
		for (int i=0;i<n-1 ;i++ )
		{
			for (int j=i+1;j<n ;j++ )
			{
				System.out.print(a[i]+ ","+a[j] + "  ");
				
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		
		int a[]={1,2,3,4,5,6,7,8,9};
		
		pairs(a);
	}
}
