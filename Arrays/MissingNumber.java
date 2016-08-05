// Find the Missing Number
// You are given a list of n-1 integers and these integers are in the range of 1 to n. 
// There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer

public class MissingNumber{
	
	public static void main(String args[]){
		int[] nums = {1,2,3,5,6,7};
		System.out.println("Missing num: "+findMissing(nums));
	}

	public static int findMissing(int[] nums){
		int x1 = 0, x2 = 0;
		int last = nums[nums.length-1];	
		// finding xor of all elements from 1..n
		for(int i=1 ; i<=last ; i++){
			x1 = x1 ^ i;
		}

		// finding xor of array with missing elements
		for( int j=0; j<nums.length; j++){
			x2 = x2 ^ nums[j];
		}
		// xor of both will return missed element
		return x1 ^ x2;
	}
		
}