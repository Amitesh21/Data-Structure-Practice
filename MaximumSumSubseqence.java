// Maximum sum such that no two elements are adjacent
// Question: Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 
// numbers in the sequence should be adjacent in the array. 
// So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way. 

// Time Complexity : O(n), no extra space

public class MaximumSumSubseqence{
	public static void main(String[] args) {
		int[] nums = {5,  5, 10, 40, 50, 35};
		System.out.println(maxSum(nums));
	}

	public static int maxSum(int[] arr){
		int inc = arr[0];	
		int exc = 0;
		for(int i=1 ; i<arr.length ; i++){
			//System.out.println("inc: "+inc +" exc: "+exc);
			int temp = inc;
			inc = Math.max(inc,exc+arr[i]);		// hold value max(prev exc+current, inc), as with prev exc only
			exc = temp;					//prev inc value
		}
		return Math.max(exc,inc);
	}
}