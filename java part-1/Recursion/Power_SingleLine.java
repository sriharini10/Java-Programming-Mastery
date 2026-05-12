class Power_SingleLine
{
	public static int  power(int base,int pow){
		
		if(pow==0)
		{
			return 1;
		}
	
		
		return base * power(base,pow-1);
		
		
	}
	public static void main(String[] args) 
	{
		int pow = 5;
		int base = 2;
		int ans =power(base,pow);
		System.out.println("result is: "+ans);
	}
}
