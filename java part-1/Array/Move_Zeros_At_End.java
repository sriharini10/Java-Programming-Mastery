import java.util.Arrays;
class Move_Zeros_At_End
{
	public static int[] moveZero(int a[]){
		
		int n= a.length;
		
		int i=0;
		int j=0;
		
		while(j<n){
			
			if (a[j]==0)
			{
				j++;
			}
			else{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
				j++;
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int a[]={1,2,0,4,3,0,5,0};
		System.out.println(Arrays.toString(moveZero(a)));
	}
}
