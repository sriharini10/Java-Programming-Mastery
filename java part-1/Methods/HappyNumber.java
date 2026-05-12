class HappyNumber 
/*A Happy Number is a number that:
------------------------------
Take the number.
Find the sum of the squares of its digits.
Repeat the process.

If the result becomes 1, the number is a Happy Number.
If it never becomes 1 and starts repeating in a loop ? it is Not Happy.

		19 ? 1² + 9² = 1 + 81 = 82  
		82 ? 8² + 2² = 64 + 4 = 68  
		68 ? 6² + 8² = 36 + 64 = 100  
		100 ? 1² + 0² + 0² = 1				*/ 


{
	public static int square(int num) {
		
        return num * num;
    }
	public static int SumOfSquare(int num){
		
		int res=0;
		
		while(num !=0 ){
			
			int last = num%10;
			
			res=res+square(last);
			
			num= num/10;
		}
		return res;
	}
	public static boolean isHappy(int num) {

        while (num != 1 && num != 4) {
            num = sumOfSquare(num);
        }

        return num == 1;
    }

    public static void main(String[] args) {

        int number = 19;

        if (isHappy(number)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}