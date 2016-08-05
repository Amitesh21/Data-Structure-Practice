// Given an array A[], write a function that segregates even and odd numbers. 
// The functions should put all even numbers first, and then odd numbers.

// Example:
// Input  = {12, 34, 45, 9, 8, 90, 3}
// Output = {12, 34, 8, 90, 45, 9, 3} 
// In the output, order of numbers can be changed, i.e., in the above example 34 can come before 12 and 3 can come before 9.

// TimeComplexity: O(n), no extra space

public class SegregateEvenOdd{

	public static void main(String[] args) {
		int[] arr = {12, 34, 45, 9, 8, 90, 3};
		SegregateEvenOdd(arr);		
	}

	public static void SegregateEvenOdd(int[] arr){
		int i = 0, j= arr.length-1;

		while(i <= j){
			while(arr[i]%2 != 0){
				i++;
			}

			while(arr[j]%2 == 0){
				j--;
			}

			if(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++; j--;
			}
		}
		for(int val : arr)
			System.out.print(val+" , ");
	}
}