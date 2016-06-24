public class Factorial_Recursion{
	public static void main(String args[]){
		System.out.println("Factorial: "+fact_rec(4));
	}

	public static int fact_rec(int num){
		//int fact=1;
		if(num==1)
			return 1;
		else return num*fact_rec(num-1);
	}
}