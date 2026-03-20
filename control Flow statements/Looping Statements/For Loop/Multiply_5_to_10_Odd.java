class  Multiply_5_to_10_Odd
{
	public static void main(String[] args) 
	{
		int mul=1;
		
		for(int i=5; i<=10; i++)
		{
			
			
			if(i%2 != 0)
			{
				mul= mul * i;
			}
			
		}
		System.out.println("multiply result is:" +mul);
	}
}
