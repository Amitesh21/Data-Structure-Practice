public class Power{

	public static void main(String[] args) {
		System.out.println(power(3,2));
	}

	public static int power(int base, int pow){
		if(pow == 1)
			return base;

		return base * power(base , pow-1);
	}
}