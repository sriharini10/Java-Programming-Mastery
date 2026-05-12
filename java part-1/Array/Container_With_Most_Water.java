class Container_With_Most_Water 
{
	public static int maxArea( int height[]){
		
		int area = 0;
		int w =0;
		int waterlevel=Integer.MIN_VALUE;
		
		int n= height.length;
		
		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n ; j++ )
			{
				w = j-i;
				
				int h=Math.min(height[i] ,height[j]);
				
				area =h * w;
				
			    waterlevel = Math.max (area,waterlevel);
			}
			
		}
		return waterlevel;
		
		
	}
	public static void main(String[] args) 
	{
		int height[] = {1,8,6,2,5,4,8,3,7};
		
		int ans =maxArea(height);
		
		System.out.println(ans);
		
	}
}
