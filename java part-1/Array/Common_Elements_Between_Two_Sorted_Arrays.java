class Common_Elements_Between_Two_Sorted_Arrays 
{
	public static void common(int a[],int b[]){
		
		for(int i=0;i<a.length;i++){
			
			for (int j=0;j<b.length ;j++ )
			{
				if (a[i]==b[j])
				{
					System.out.println(a[i]);     //System.out.println(b[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[] ={2,5,9,10,15,19,20};
		
		int b[]={1,3,4,9,15};
		
		common(a,b);
	}
}
