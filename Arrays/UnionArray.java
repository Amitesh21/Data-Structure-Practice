// Given two arrays A and B, find union between these two array.  
// If there are repetitions, then only one occurrence of element should be printed in union.

// TimeComplexity: O(n+m), min(n,m) extra space
class UnionArray {
	public static void main (String[] args) {
		int[] arr1 = {1, 3, 4, 5, 7};
		int[] arr2 = {2, 3, 5, 6};
		findUnion(arr1 , arr2);
	}
		public static void findUnion(int[] arr1 , int[] arr2){
		    int unionSize = arr1.length + arr2.length;
		    int[] unionArr = new int[unionSize];
		    int i=0, j=0, k=0;
		    // traversing both array using 2 pointers and comparing is same
		    while(i<arr1.length && j<arr2.length){
		        if(arr1[i]==arr2[j]){
		        	if(k>=1 && arr1[i]==unionArr[k-1]){	// checking to avoid repeated value in union array
		            	i++; j++;
		        	}
		        else{
		        	unionArr[k]=arr1[i];
		            k++; i++; j++;
		        }
		    }
		    // if not same, incrementing pointer of smaller value
		        else{	
    		        if(arr1[i]<arr2[j]){
    		        	unionArr[k] = arr1[i];
    		        	i++; k++;
    		        }
    		        else{
    		        	unionArr[k] = arr2[j];
    		        	j++; k++;
    		        }
		        }
		    }

		    while(i<arr1.length){
		    	unionArr[k] = arr1[i];
		    	k++; i++;
		    }

		    while(j<arr2.length){
		    	unionArr[k] = arr2[j];
		    	k++; j++;
		    }
		    for(int val : unionArr)
		        System.out.println(val);
		}
}