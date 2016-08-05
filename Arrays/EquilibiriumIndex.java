// Write a function int equilibrium(int[] arr, int n); 
// that given a sequence arr[] of size n, returns an equilibrium index (if any) or -1 if no equilibrium indexes exist.

// Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

// TimeComplexity: (n), space: O(1)
public class EquilibiriumIndex{
	
	public static void main(String[] args) {
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		findEquilibirium(arr);
	}

	public static void findEquilibirium(int[] arr){

		if(arr.length<=1)
			return;

		int total = 0, sumLeft = 0;
		// finding total sum
		for(int i=0 ; i<arr.length; i++)
			total += arr[i];
		// finding element whose sumleft is equall to half of total excluding itself
		for(int i=0 ; i<arr.length; i++){
			if(sumLeft == (total-arr[i])/2)
				System.out.println("index: "+i);
			sumLeft +=arr[i];
		}
	}
}