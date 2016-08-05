
// Find the two repeating elements in a given array
// You are given an array of n+2 elements. All elements of the array are in range 1 to n. 
// And all elements occur once except two numbers which occur twice. Find the two repeating numbers.

// TimeComplexity : O(n), no extra space

public class TwoRepeatingElements{
	
	public static void main(String[] args) {
		int[] arr = {4, 2, 4, 5, 2, 3, 1};
		twoRepeatedElements(arr);
	}

	public static void twoRepeatedElements(int[] arr){
		// making the index of value traversed to -ve, so if it comes again, can be identify
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[Math.abs(arr[i])] < 0 )
				System.out.println(Math.abs(arr[i]));
			else
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
		}
	}
}