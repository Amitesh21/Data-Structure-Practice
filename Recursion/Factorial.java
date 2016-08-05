public class Factorial{

	public static void main(String[] args) {
		System.out.println(factorial_recursion(5));
		System.out.println(factorial_loop(5));
	}

	// using recursion
	public static int factorial_recursion(int val){
		if(val == 1)
			return 1;

		return val * factorial_recursion(val-1);
	}
	
	// using loop
	public static int factorial_loop(int val){
		int fact =1;
		while(val>=1){
			fact *= val;
			val--;
		}
		return fact;
	}
}