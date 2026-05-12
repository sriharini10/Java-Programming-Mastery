class LogicalAnd 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=15;
		int c=10;
		int d=25;
		
		System.out.println(a==10 && b!=25);		//true && true --->true
		System.out.println(b!=10 && d<=20);		//true && false --->false
		System.out.println(b!=15 && c>=10);		//false && true --->false
		System.out.println(c>=40 && d==56);		//false && false --->false
	}
}
