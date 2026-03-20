class LeftAligned_RightAngled_Triangle_Number
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		int k=1;
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if (i>=j)
				{
					System.out.print(j+1 +" ");
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

