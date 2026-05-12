import java.util.Scanner;

import java.util.Arrays;

class Taking_ArrayData_From_users 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		
		System.out.println("Enter array data: ");
		
		for(int i=0; i<arr.length;i++){
			
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array is: ");
		
		System.out.println(Arrays.toString(arr));
		
	}
}
