// Largest Sum Contiguous Subarray
// Write an efficient C program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.

public class largestConinousSubArraySum{
	
	public static void main(String args[]){
		int[] nums = {-2, -3, 4, 3, -1, -2, 1, 5, -3};
		System.out.println("Max sum: "+largestSum(nums));
	}

	public static int largestSum(int[] nums){
		int maxSum=0;
		int tempSum=0;
		for(int i=0 ; i<nums.length ; i++){
			tempSum = tempSum + nums[i];
			if(tempSum<0)	//if not setting to zero, then for i=2, tempSum=-1, not 4 which is largest for subarraynums[0..2]
				tempSum=0;
			if(tempSum>maxSum)
				maxSum = tempSum;
		}
		return maxSum;
	}
		
}