
// Find the Number Occurring Odd Number of Times
// Given an array of positive integers. All numbers occur even number of times 
// except one number which occurs odd number of times. Find the number in O(n) time & constant space.

public class OccuringNumberOfTimes{
	public static void main(String args[]){
		//int[] nums = {1,2,3,4,3,2,4,1,7,7};
		//int[] nums = {4,4,4,4};
		int[] nums = {};
		System.out.println("odd times: "+findOddTime(nums));
	}

	public static int findOddTime(int[] nums){
		int res = 0;
		for(int i=0; i<nums.length; i++){
			res = res ^ nums[i];
		}
		return res;		//	will return no. with occurence of odd number of times
	}
}