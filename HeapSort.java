public class HeapSort{

	static int[] arr = {-1, 5, 2};
	static int[] sorted = new int[arr.length];	

	public static void main(String[] args) {
	// showing unsorted array
		display(arr);
		int size = arr.length;
		if(size<=1)
			return;
		heapSort(arr , size);
	// showing sorted array
		System.out.println("");
		display(sorted);
	}

	public static void heapSort(int[] arr, int size){
		sorted[0] = -1;
		// calling heapify for each element and storing in sorted array
		for(int i=1 , j=size; j>1 ; i++ , j--){	
			heapify(arr , j);
			sorted[i] = arr[1];	// putting root into sorted array
			arr[1] = arr[j-1];	// putting last element in place of root
		}
	}

	public static void heapify(int[] arr, int size){
		int start, left, right, temp;
		for(int i = size/2; i>=1; i-- ){
			start = i;
			left = 2 * start ;
			right = 2 * start +1 ;
			temp = start;
			// if left child is smaller then parent
			if (left < size && arr[left] < arr[temp])
				temp = left;
			// if right child is smaller than parent
			if (right < size && arr[right] < arr[temp])
				temp = right;
			// if anychild is smaller, temp get updated and need to swap
			if (temp != start){
				int val = arr[start];
				arr[start] = arr[temp];
				arr[temp] = val;
				heapify(arr , size);	//checking again
			}
		}
	}
	// print the array
	public static void display(int[] arr){
		for(int i : arr)
			System.out.print(i+" , ");
	}

}