// Segregate 0s and 1s in an array
// You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

// Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
// Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 

// TimeComplexity = O(n), no extra space
public class SegregateNumbers{
	
	public static void main(String[] args) {
		int[] arr = {2,3,3,3,3,2,3,2,3,2};
		arr = segregate(arr);

		for(int i : arr)
			System.out.println(i);
	}

// moving pointer from both end and swapping
	public static int[] segregate(int[] arr){
		int i = 0 , j = arr.length-1;
		while(i<j){
			while(arr[i]==2 && i<j)
				i++;
			while(arr[j]==3 && i<j)
				j--;

			if(i<j){
				arr[i] = 2;
				arr[j] = 3;
				i++; 
				j--;
			}
		}
		return arr;
	}
}