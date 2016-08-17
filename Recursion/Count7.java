
// Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.

public class Count7{

	public static void main(String[] args) {
		System.out.println(count7(27727797));
	}

	public static int count7(int val){
		if(val == 0)
			return 0;

		if(val%10 == 7)
			return 1+count7(val/10);
		else
			return count7(val/10);

	}
}