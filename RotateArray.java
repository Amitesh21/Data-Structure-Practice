
// Time Complexity : O(2n) , no extra space

public class RotateArray{
	
	public static void main(String args[]){
		int[] nums = {1,2,3,4,5,6,7};
		int rotateBy = 2;
		rotate(nums, rotateBy);
	}

	public static void rotate(int[] arr, int rotateBy){
		
		// printing original array
		System.out.print("Original array: ");
		for(int k=0 ; k<arr.length; k++){
			System.out.print(arr[k]);
		}
		System.out.println("");
		System.out.print("Rotaing 1st half till rotateBy: ");
		arr = reverse(arr, 0, rotateBy-1);
		for(int k=0 ; k<arr.length; k++){
			System.out.print(arr[k]);
		}

		System.out.println("");
		System.out.print("Rotating 2nd half: ");
		arr = reverse(arr, rotateBy, arr.length-1);
		for(int k=0 ; k<arr.length; k++){
			System.out.print(arr[k]);
		}

		System.out.println("");
		System.out.print("Rotating entire array: ");
		arr = reverse(arr, 0, arr.length-1);
		for(int k=0 ; k<arr.length; k++){
			System.out.print(arr[k]);
		}
	}

	public static int[] reverse(int[] arr, int start, int end){
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
		
}