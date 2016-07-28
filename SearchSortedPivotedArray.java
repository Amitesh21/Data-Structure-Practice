public class SearchSortedPivotedArray{
	
	public static void main(String[] args) {
		int[] arr = { 6 , 7 , 9 ,11, 2 , 3 , 4 , 5 };
		findPivot(arr);
	}

	public static void findPivot(int[] arr){
		int low = 0, high = arr.length-1;
		int mid =0;
		while(low <= high){
			mid = (low+high)/2;
			
			if(low == high){
				System.out.println(low);
				return;
			}

			if(arr[mid] < arr[low]){
				high = mid-1;
			}
			
			if(arr[mid] > arr[low]){
				low = mid+1;
			}
		}
	}
}