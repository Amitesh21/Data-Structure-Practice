// Majority Element
// Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).

// Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:

// Time Complexity: O(n) , no extra space

import java.util.*;
public class MajorityElement{
	public static void main(String[] args){
		int[] nums = {4,3,4,4 , 2, 2, 5};		//initialize you array
		System.out.println("Majority Element : "+majElement(nums));
	}

// Time Complexity: O(n) , Space Complexity: O(n)
	// public static int findElement(int[] nums){
	// 	int limit = nums.length/2;	//finding value of array length / 2
	// 	HashMap<Integer , Integer> hm = new HashMap<Integer, Integer>();
	// 	// storing in Hashmap
	// 	for(int i=0 ; i<nums.length; i++){
	// 		if(hm.containsKey(nums[i]))
	// 			hm.put(nums[i], hm.get(nums[i])+1);
	// 		else
	// 			hm.put(nums[i], 1);
	// 	}
	// 	// iterating to find key with values more than limit
	// 	Iterator itr = hm.entrySet().iterator();
	// 	while(itr.hasNext()){
	// 		Map.Entry entry = (Map.Entry)itr.next();
	// 		if(((int)entry.getValue())>limit){
	// 			return (int)entry.getKey();
	// 		}
	// 	}
	// 	return -1;	//else returning -1
	// }

	public static int majElement(int[] arr){
		int element = Integer.MAX_VALUE;
		int count = 0;
		for(int i = 0; i < arr.length ; i++){
			if(arr[i]==element)
				count++;
			else{
				count--;
				if(count==0){
					element = arr[i];
					count = 1;
				}
			}
		}
		return element;
	}
}