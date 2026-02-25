class A15 
{
	public static void main(String[] args) 
	{
		int a = 130;        // int value
        byte b = (byte) a; // narrowing: int ? byte

        System.out.println("Int value  : " + a);
        System.out.println("Byte value : " + b);
	}
}
