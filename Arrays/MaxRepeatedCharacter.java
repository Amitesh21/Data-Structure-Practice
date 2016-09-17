public class MaxRepeatedCharacter{

	public static void main(String[] args) {
		String str = "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbcddddeeeeee";
		maxRepeatedCharacter(str);
	}

	public static void maxRepeatedCharacter(String str){
		
		if(str.length() ==0 || str==null){
			System.out.println("Enter valid input");
			return;
		}

		int[] arr = new int[256];
		for(int i=0; i<str.length() ; i++){
			arr[(int)str.charAt(i)] =arr[(int)str.charAt(i)]+1; 
		}

		int max = -1;
		int maxIndex = -1;
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i]>max){
				max = arr[i];
				maxIndex =i;
			}
		}
		System.out.println("Max char: "+(char)maxIndex+", count: "+max);
	}
}