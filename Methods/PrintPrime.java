class PrintPrime 
{
	public static boolean isPrime(int n){
		
		int count =0;
		for(int i =1; i<=n; i++){
			
			if(n%i == 0){
				count++;
				
			}
			
		}
		if(count==2){
			return true;
		}
		return false;
		
		
	}
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("Prime Number between 1 to 100 are : " );
		
		for (int i =1; i<=100; i++ )
		{
			if(isPrime(i)){
				System.out.println(i);
				
			}
		}
		
	
		
	}
}
