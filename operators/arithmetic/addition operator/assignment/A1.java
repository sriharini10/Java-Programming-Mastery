class A1 
{
	public static void main(String[] args) 
	{
		String s1 = 10+"java"+10+20;
		String s2 = 10+20+"java"+30;
		String s3 = "java"+10+20+30;
		String s4 = "java"+(10+20+30);
		String s5 = 10+20+30+"java";
		String s6 = "result:" +10+20+30;
		String s7 = "result:" +(10+20+30);
		String s8= 10+20+ "java" +(10+20);
		String s9 = "sum of " +10+ "and" +20+ "is" +(10+20);
		String s10="output:" + (10+20)+ "java" +(30+40);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
	}
}
