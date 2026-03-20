class A12
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int i = 1; i<=100; i++)
		{
			
			if(i%9==0){
				
			System.out.println(i);
			count ++;
			}
			if(count==5){
				break;
			}
			
		}
	}
}
