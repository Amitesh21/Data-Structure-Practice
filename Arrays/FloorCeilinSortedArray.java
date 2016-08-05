// Floor and Ceiling in a sorted array
// Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x,
// and the floor is the greatest element smaller than or equal to x.

public class FloorCeilinSortedArray{
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 10, 10, 12, 19};
		floorCeil(arr , 11);		
	}

// using binary search to find, if key not found, look for nearest value in array
	public static void floorCeil(int[] arr, int key){
		int low = 0 , high = arr.length-1;
		int mid =0;
		while(low <= high){
			mid = (low+high)/2;
			if(arr[mid] == key){
				System.out.println("floor: "+key);
				System.out.println("Ceil: "+key);
				return;
			}
			if(arr[mid] < key)
				low = mid+1;

			if(arr[mid] > key)
				high = mid-1;
		}
		// System.out.println("mid: "+arr[mid]);
		if (arr[mid]>key){
			System.out.println("floor: "+arr[mid-1]);
			System.out.println("Ceil: "+arr[mid]);
		}
		else{
			System.out.println("floor: "+arr[mid]);
			System.out.println("Ceil: "+arr[mid+1]);	
		}
	}
}