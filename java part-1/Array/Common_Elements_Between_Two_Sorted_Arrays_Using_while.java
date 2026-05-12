class Common_Elements_Between_Two_Sorted_Arrays_Using_while
{
	public static void common(int a[],int b[]){
		
		int i=0;
		int j=0;
		
		while(i< a.length && j<b.length){
			if (a[i]==b[j])
			{
				System.out.println(a[i] +" ");
				i++;
				j++;
			}
			else if (a[i] < b[j])
			{
				i++;
			}
			else {
				j++;
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
