public class Fibonacci{

	public static void main(String[] args) {

		for(int i =1 ; i<8 ; i++)
			System.out.println(fibonacci(i));
	}

	public static int fibonacci(int val){
		if(val == 1 || val == 2)
			return 1;	

		return fibonacci(val-1) + fibonacci(val-2);

	}  
}
// 0,1,1,2,3,5,8,13,21