class HollowSqualre_Diagonals_Midlines
{
	public static void main(String[] args) throws Exception
	{
		int n=13;
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if (i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1 || i==n/2 || j==n/2 )
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

