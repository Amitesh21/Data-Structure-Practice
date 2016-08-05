public class Fibonacci_nth_Element{
	public static void main(String args[]){
		System.out.println("fibonacci nth element: "+fibonacci_element(8));
		System.out.println("fibonacci nth element using loop: "+fib_num(8));
	}
	
	//---using recursion
	public static int fibonacci_element(int pos){
		if(pos==1)
			return 0;
		if(pos==2)
			return 1;
		//int fact=1;
		
		else return fibonacci_element(pos-1)+fibonacci_element(pos-2);
	}

	//---using while loop
	public static int fib_num(int pos){
		int first = 0;
		int second = 1;
		int sum=0;
		if(pos==1) return 0;
		if(pos==2) return 1;

		while(pos-2>0){
			sum=first+second;
			first=second;
			second=sum;
			pos--;
		}
		return sum;
	}
}