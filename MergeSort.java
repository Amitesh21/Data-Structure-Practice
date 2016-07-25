public class MergeSort{

	static int[] arr = {5,2,12,7,9,13};
	static int[] temp = new int[arr.length];
	
	public static void main(String[] args) {
		
		int length = arr.length-1;
		for(int i : arr){
			System.out.print(i+" , ");
		}
		MergeSort(0 , length);

		for(int i : arr){
			System.out.print(i+" , ");
		}
	}

	public static void MergeSort(int low, int high){
		while(low<high){
			int mid = (low+high)/2;
			//System.out.print("low: "+low+" high: "+high);
			//System.out.println("");
			MergeSort(low , mid);
			MergeSort(mid+1 , high);
			//merge(low, mid, high);
		}
	}

	public static void merge(int low, int mid, int high){
		 // System.out.print("high: "+high);
		for(int i = low; i <= high ; i++){
			temp[i] = arr[i];
		}

		int i = low, j = mid+1, k = low;
		while(i <= mid && j <= high){
			if(temp[i] < temp[j]){
				arr[k] = temp[i];
				i++;
			}
			else{
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i <= mid){
			arr[k] = temp[i];
			i++; k++;
		}
		while(j<=high){
			arr[k] = temp[j];
			j++; k++;
		}
	}
}