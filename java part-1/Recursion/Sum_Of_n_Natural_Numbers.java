class Sum_Of_n_Natural_Numbers 
{
	public static void addNaturals(int i,int n,int sum)
	{
		
		
		/* Another base case is 
		
		if(i==n){
			sum = sum +i;
			System.out.println(sum);
			return;
		
		}
		
		*/
		
		
		//base case                                      
		
		if(i>n){
			System.out.println(sum);
			return;
		}
		
		sum = sum + i;
		
		addNaturals(i+1,n,sum);
		
		
	}
	
	public static void main(String[] args) 
	{
		addNaturals(1,5,0);
		
	}
}
