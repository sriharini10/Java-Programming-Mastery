class Container_With_Most_Water_using_Single_Loop
{
	public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=Integer.MIN_VALUE;

        while (i<j){
            int h = Math.min(height[i] , height[j]);
            int w=j-i;
            int area = h*w;
            maxArea=Math.max(area,maxArea);

            if (height[i] < height[j]){
                i++;

            }
            else{
                j--;
            }
        }
        return maxArea;

        
    }
	public static void main(String[] args) 
	{
		int height[] ={1,8,6,2,5,4,8,3,7};
		
		int ans= maxArea(height);
		
		System.out.println("Maximum waterlevel is: "+ans);
	}
}
