class A1_Lines
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		
		for(int i =0; i<n; i++)
		{
			
			//Line1
			for(int j=0; j<n; j++)
			{
				if (j==0 || i==n-1 || i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			//Spaces between Two Boxes	
			System.out.print("     ");
				
			//Line2
			for(int j=0; j<n; j++)
			{
				if (j==0 || i==0 || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			//Spaces between Two Boxes	
			System.out.print("     ");
			
			//Line3
			for(int j=0; j<n; j++)
			{
				if (j==n-1 || i==n-1 || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			//Spaces between Two Boxes	
			System.out.print("     ");
				
			//Line4
			for(int j=0; j<n; j++)
			{
				if (i==0 || j==n-1 || i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			
			
			Thread.sleep(100);
				
			}
			System.out.println();
		}
	}
}
