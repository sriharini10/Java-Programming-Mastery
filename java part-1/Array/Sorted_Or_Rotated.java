class Sorted_Or_Rotated 
{
	public static boolean isSorted(int a[]){
		int count =0;
		int n=a.length;
		
		if(a[n-1] >a[0]){
			count++;
			
		} 
		for(int i=0;i<n-1;i++){
			
				if(a[i]>a[i+1]){
					count++;
				}
			
		}
		return count<=1;
	}
	public static void main(String[] args) 
	{
		int a[]={5,9,2,3,4};
		
		if(isSorted(a)){
			System.out.println("sorted or rotated");
		}
		else{
			System.out.println("not sorted orr not rotated");
		}
	}
}
