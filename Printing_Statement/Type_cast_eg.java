class Type_cast_eg 
{
	public static void main(String[] args) 
	{
		byte num1=20;
		short num2=num1;   //byte to short 
		int num3=num2;     //short to int
		long num4=num3;    //int to long
		float num5=num4;   //long to float
		double num6=num5;  //float to double
		
		System.out.println(num1);  
		System.out.println(num2);  
		System.out.println(num3);  
		System.out.println(num4);  
		System.out.println(num5);  
		System.out.println(num6);  
	}
}
