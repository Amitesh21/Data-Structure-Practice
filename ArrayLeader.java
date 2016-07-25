// Leaders in an array
// Write a program to print all the LEADERS in the array. 
// An element is leader if it is greater than all the elements to its right side. 
// And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

// Time Complexity = O(n), no extra space
public class ArrayLeader{
	public static void main(String[] args) {
		int[] nums = {16, 17, 4, 3, 5, 2};
		findLeader(nums);
	}

	public static void findLeader(int[] arr){
		int rightMax= arr[arr.length-1];
		System.out.println("leader: "+rightMax); //rightmost element always be leader
		// from end, tracking max element and comparing it with current
		// if less than max, then less than all
		for(int i = arr.length-2; i>=0 ; i--){
			if(arr[i]>rightMax){	
				System.out.println("leader: "+arr[i]);
				rightMax = arr[i];	//updating rightMax with new max value
			}
		}
	}
}