// Given a non-negative int n, return the sum of its digits recursively (no loops).
// sumDigits(126) → 9

public class SumOfDigits{
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(239));
	}

	public static int sumOfDigits(int val){
		
		if(val == 0)
			return 0;

		return val%10 + sumOfDigits(val/10);

	}
}