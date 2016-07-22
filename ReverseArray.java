
public class ReverseArray{
	
	public static void main(String args[]){
		int[] nums = {1,2,3,4,5,6,7};

		// priniting original array
		System.out.print("Original array: ");
		for(int k=0 ; k<nums.length; k++){
			System.out.print(nums[k]);
		}

		System.out.println("");
		nums = reverse(nums);	//calling reverse function
		
		// printing reverse array
		System.out.print("Reverse array: ");
		for(int k=0 ; k<nums.length; k++){
			System.out.print(nums[k]);
		}
	}

	public static int[] reverse(int[] nums){
		int i = 0, j = nums.length-1;
		// swapping first and last elements
		while(i<j){	
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		return nums;
	}
}