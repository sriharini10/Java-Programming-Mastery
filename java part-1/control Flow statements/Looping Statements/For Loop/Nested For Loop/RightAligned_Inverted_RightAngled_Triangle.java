class RightAligned_Inverted_RightAngled_Triangle
{
	public static void main(String[] args) throws Exception
	{
		int n=9;
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if (i<=j)
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

