class A14 
{
	public static void main(String[] args) 
	{
		double d = 123.456;   // 8 bytes
        int i = (int) d;      // narrowing: double ? int

        System.out.println("Double value : " + d);
        System.out.println("Int value    : " + i);
	}
}
