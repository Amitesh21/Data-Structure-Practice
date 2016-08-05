// Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted
// Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] 
// such that sorting this subarray makes the whole array sorted.

// Examples:
// 1) If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], 
// your program should be able to find that the subarray lies between the indexes 3 and 8.

// TimeComplexity = O(n), no extra space
public class MinLengthUnsortedSubArray{
	
	public static void main(String[] args) {
		int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		minLengthUnsortedSubArray(arr);
	}

	public static void minLengthUnsortedSubArray(int[] arr){

		if(arr.length<=1)
			return;

		int i = 0, j = arr.length-1, subMin = Integer.MAX_VALUE, subMAx = Integer.MIN_VALUE;
		// finding the start of unsorted list
		while(i<arr.length-1 && arr[i] <= arr[i+1])
			i++;
		// if start = last element, list is already sorted
		if(i == arr.length-1){
			System.out.println("already sorted ");			
			return;
		}
		// finding end of unsorted list
		while(j>0 && arr[j] >= arr[j-1])
			j--;
		// finding min and max element of unsorted list, min element can be less than 'i' i.e position of actual unsorted list
		for(int k=i; k<=j ; k++){
			if(arr[k] < subMin)
				subMin = arr[k];	// 25
			if(arr[k] > subMAx)
				subMAx = arr[k];	// 40
		}

		// finding actual start of unsorted list
		for(int k=0 ; k<=i; k++){
			if(arr[k] > subMin){
				System.out.println("start: "+k);
				break;
			}
		}
		// finding actual end of unsorted list
		for(int k=j ; k<=arr.length-1; k++){
			if(arr[k] > subMAx){
				System.out.println("end: "+(k-1));
				break;
			}
		}
	}
}