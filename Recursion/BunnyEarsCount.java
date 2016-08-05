public class BunnyEarsCount{

	public static void main(String[] args) {
		System.out.println(earCount(8));
	}

	public static int earCount(int bunnies){
		if(bunnies == 1)
			return 2;

		return 2 + earCount(bunnies-1);
	}
}