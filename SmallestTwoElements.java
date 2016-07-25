// Find the smallest and second smallest element in an array
// Write an efficient C program to find smallest and second smallest element in an array.

// Example:

// Input:  arr[] = {12, 13, 1, 10, 34, 1}
// Output: The smallest element is 1 and 
//         second Smallest element is 10

// TimeComplexity : O(n), no extra space
public class SmallestTwoElements{
	public static void main(String[] args) {
		int[] arr = {12, 13, 1, 10, 34, 10, 1};
		smallestTwo(arr);
	}

	public static void smallestTwo(int[] arr){
		if(arr.length <2)
			return;

		int firstSmallest = Integer.MAX_VALUE;
		int secSmallest = Integer.MAX_VALUE;

		for(int i=0 ; i<arr.length ; i++){
			if(arr[i]<secSmallest){
				if(arr[i]<firstSmallest){
					secSmallest = firstSmallest;
					firstSmallest = arr[i];			
				}
				if(arr[i] != firstSmallest)		// if min element is duplicated, both should not be same
					secSmallest = arr[i];
			}

		}
		System.out.println("firstSmallest: "+firstSmallest);
		System.out.println("secSmallest: "+secSmallest);
	}
}