public class BinarySearch{

	public static void main(String[] args) {
		int[] arr = {2,5,7,13,15,17,19,22,25,38,40};
		// search(arr , 22);
		binarySearch(arr , 0 , arr.length-1, 17);
	}

// 	Using while loop
	public static void search(int[] arr, int key){
		int low = 0;
		int high = arr.length - 1;
		int count =0;	//	just to find no. of comparisions it takes to find
		while(low <= high){
			count++;

			int mid = (low+high)/2;

			if(arr[mid] == key){
				System.out.println("element found at: "+ mid +" count: "+count);
				return;
			}
			if(arr[mid] > key)
				high = mid-1;
			
			if(arr[mid] < key)
				low = mid+1;
		}
		System.out.println("not found");
	}

// 	using recursion
	public static void binarySearch(int[] arr, int low, int high, int key){
		int mid = (low+high)/2;

		if (low > high){
			System.out.println("not found");
			return;
		}

		if (arr[mid] == key){
			System.out.println("key found at: "+mid);
			return;
		}

		if(arr[mid] < key)
			binarySearch(arr , mid+1 , high , key);

		if(arr[mid] > key)
			binarySearch(arr , low , mid-1 , key);	

	}

}