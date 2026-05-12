class A11
{
	public static void main(String[] args) 
	{
		for (int i = 1; i<=30; i++)
		{
			
			if(i %5 ==0){
				continue;
			}
			if(i%13==0)
				break;
			System.out.println(i);
			
		}
	}
}
