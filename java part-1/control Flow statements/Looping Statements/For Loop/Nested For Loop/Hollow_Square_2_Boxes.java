class Hollow_Square_2_Boxes
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		
		for(int i =0; i<n; i++)
		{
			
			//Box1
			for(int j=0; j<n; j++)
			{
				if (i==0 || j==0 || i==n-1 || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			//Spaces between Two Boxes	
			System.out.print(" ");
				
			//Box2
			for(int j=0; j<n; j++)
			{
				if (i==0 || j==0 || i==n-1 || j==n-1)
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
