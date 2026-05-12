class NumberSquare
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if (true)
				{
					System.out.print(i+" ");
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



/*

0 0 0 0 0
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
*/