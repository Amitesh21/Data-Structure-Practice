// Intersection of two sorted arrays
// Given two sorted arrays, find their union and intersection.

// For example, if the input arrays are: 
// arr1[] = {1, 3, 4, 5, 7}
// arr2[] = {2, 3, 5, 6}
// Then your program should print {3, 5} as Intersection.

// TimeComplexity: O(n+m), min(n,m) extra space 

public class ArrayIntersection{
	
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 5, 7};
		int[] arr2 = {2, 3, 5, 6};
		findIntersection(arr1 , arr2);
	}

	public static void findIntersection(int[] arr1 , int[] arr2){
		int i=0 , j=0 , k=0;
		int[] intersArray = new int[Math.min(arr1.length,arr2.length)];
		while(i<arr1.length && j<arr2.length){
			if(arr1[i] == arr2[j]){
				intersArray[k] = arr1[i];
				k++; i++; j++;
			}
			else{
				if(arr1[i]<arr2[j])
					i++;
				else
					j++;
			}
		}
		for(int val : intersArray)
			System.out.println(val);
	}

}