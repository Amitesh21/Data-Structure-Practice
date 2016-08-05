// Maximum difference between two elements such that larger element appears after the smaller number
// Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the smaller number in arr[].

// Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). 
// If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)

// TimeComplexity: O(n), no extra space
public class MaxDifference{
	public static void main(String[] args) {
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		maxDifference(arr);
	}

	public static void maxDifference(int[] arr){
		// keeping track of minimum element and max difference while iterating over array
		int minElement = arr[0];
		int maxDiff = arr[1]-arr[0];
		for(int i=1 ; i<arr.length; i++){
			if(arr[i]-minElement > maxDiff)
				maxDiff = arr[i]-minElement;
			if(arr[i]<minElement)
				minElement = arr[i];
		}
		System.out.println("max diff: "+maxDiff);
	}
}