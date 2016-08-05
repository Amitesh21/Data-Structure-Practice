// Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. 
// The functions should put all 0s first, then all 1s and all 2s in last.

// Example
// Input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
// Output = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

// Time Complexity: O(n), no extra space

public class sort012{
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort(arr);
	}

	public static void sort(int[] arr){
		int low = 0, mid = 0, high = arr.length-1, temp=0;
		while(mid <= high){
			if(arr[mid] == 0){			//if 0, swap it with left most and increment the pointer
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++; low++;
			}
			else if(arr[mid] == 1)		// just leave as it it, ultimately will be in between of 0 & 1 at end
				mid++;

			else {						// if 2, swap it with right most and decrement the pointer
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
		}

		for(int i : arr)
			System.out.println(i);
	}

}