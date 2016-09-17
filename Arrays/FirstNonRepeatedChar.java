public class FirstNonRepeatedChar{

	public static void main(String[] args) {
		String str = "Hello DHeeraj";
		firstNonRepeatedChar(str);
	}

	public static void firstNonRepeatedChar(String str){
		int[] arr = new int[256];
		for(int i = 0; i< str.length() ; i++){
			if(arr[(int)str.charAt(i)] == 0){
				arr[(int)str.charAt(i)] = 1;
			}
			else
				arr[(int)str.charAt(i)] = arr[(int)str.charAt(i)]+1;
		}

		for(int i = 0; i<str.length() ; i++){
			if(arr[(int)str.charAt(i)] == 1){
				System.out.println("First char: "+str.charAt(i));
				break;
			}
		}
	}
}