class LeftAligned_Inverted_RightAngled_Triangle_Number_123
{
	public static void main(String[] args) throws Exception
	{
		int n=4;
		int k=1;
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if (i>=j)
				{
					System.out.print(k++ +" ");
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

