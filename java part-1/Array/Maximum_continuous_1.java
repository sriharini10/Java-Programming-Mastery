class Maximum_continuous_1 
{
	public static int count(int a[]){
		
		int count=0;
		int n=a.length;
		int maxcount=Integer.MIN_VALUE;
		
		for (int i=0;i<n ;i++ )
		{
				
			if(a[i]==1){
					
				count++;
				maxcount=Math.max(count,maxcount);
			}
			
			
			else{
				count=0;
			}
		}
		return maxcount;
		
	}
	public static void main(String[] args) 
	{
		int a[] ={0,1,1,0,1,0,1,1,1,0};
		
		System.out.println("cout of Maximum countinuous 1 is:  " +count(a));
	}
}
