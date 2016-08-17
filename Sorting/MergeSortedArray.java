// Merge an array of size n into another array of size m+n
// Asked by Binod
// Question:
// There are two sorted arrays. First one is of size m+n containing only m elements. 
// Another one is of size n and contains n elements. 
// Merge these two arrays into the first array of size m+n such that the output is sorted.

// TimeComplexity: O(n+m) , zero space

public class MergeSortedArray{
	
	public static void main(String args[]){
		int[] arr1 = new int[7];
		int[] arr2 = new int[3];
		
		arr1[0] = 2; arr1[2] = 5; arr1[4] = 7; arr1[6] = 9;
		arr2[0] = 1; arr2[1] = 7; arr2[2] = 11;

		// original array1
		// System.out.println("Original Array1:");
		// for(int i=0; i<arr1.length ; i++){
		// 	System.out.print(arr1[i]+" , ");
		// }

		// original array2
		// System.out.println("Original Array2:");
		// for(int i=0; i<arr2.length ; i++){
		// 	System.out.print(arr2[i]+" , ");
		// }

// 		Shifting all the non zero elements to right side of an array
		arr1 = shift(arr1);

//		merging both the array 
		merge(arr1, arr2);
		}

	public static void merge(int[] arr1, int[] arr2){
	 	int ptr1=0 , ptr2=0;
	 	// finding the index of first non zero element of arr1
		for(int i=0 ; i<arr1.length; i++){
			if(arr1[i]!=0){
				ptr1=i;
				break;
			}
		}
		// System.out.print("ptr1: "+ptr1);
		int pos = 0;	//index position to insert smaller value
		while(ptr1<arr1.length && ptr2<arr2.length){

			if(arr1[ptr1]>=arr2[ptr2]){
				arr1[pos] = arr2[ptr2];
				ptr2++;
			}
			else{
				arr1[pos] = arr1[ptr1];
				ptr1++;
			}
			pos++;
		}
// 		if some elements left in arr2 to insert in arr1. No same check for arr1 bcz if left, they are already sorted
		if(ptr1==arr1.length){
			while(ptr2<arr2.length){
				arr1[pos] = arr2[ptr2];
				pos++; ptr2++;
			}
		}
		// printing sorted merged array
		System.out.println("merged array: ");
		for(int i=0; i<arr1.length ; i++){
			System.out.print(arr1[i]+" , ");
		}
	}
		
		// shifting all non zero element to right
	public static int[] shift(int[] arr){
		int i=arr.length-1, j=arr.length-1;
		while(j>=0){
			if(arr[j]==0){
				j--;
			}
			else{
				arr[i]=arr[j];
				if(i!=j)
					arr[j]=0; 	//if both are same, no need to make zero 
				i--;
				j--;
			}
		}
		// System.out.println("Array after shift: ");
		// for(int k=0; k<arr.length ; k++){
		// 	System.out.print(arr[k]+ " , ");
		// }
		return arr;
	}
}
