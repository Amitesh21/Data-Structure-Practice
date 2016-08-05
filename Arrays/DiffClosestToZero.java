// Two elements whose sum is closest to zero
// Question: An Array of integers is given, both +ve and -ve. 
// You need to find the two elements such that their sum is closest to zero.

// For the below array, program should print -80 and 85.

// TimeComplexity : O(nlog(n)) , no extra space
import java.util.*;

public class DiffClosestToZero{
	public static void main(String[] args) {
		int[] nums = {1, 60, -10, 5 , 70, -80, 95};
		closestToZero(nums);
	}

	public static void closestToZero(int[] arr){
		int minDiff = Integer.MAX_VALUE;
		Arrays.sort(arr);

		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" , ");
		}

		int l_index = 0;
		int r_index = arr.length-1;
	
		for(int i=0, j=arr.length-1; i < j;){		//using two pointers placed at both ends
			int diff = arr[i]+arr[j];
			
			if(Math.abs(diff) < Math.abs(minDiff)){
				minDiff = diff;
				l_index = i;		//keeping index of those elements
				r_index = j;
			}
			if(diff > 0)		// changing value in such a way that diff will remain close to zero
				j--;			
			else
				i++;
		}
		System.out.println("l_index: "+l_index+" r_index: "+r_index);
	}
}