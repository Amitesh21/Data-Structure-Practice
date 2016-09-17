
public class DuplicatesCharInString{

	public static void main(String[] args) {
		String str = "Hello Dheeraj, How are you?";	
		findDuplicate(str);
	}

	public static void findDuplicate(String str){
		int[] arr = new int[256];

		for(int i=0; i<str.length(); i++){
			if(arr[(int)str.charAt(i)]==0){
				arr[(int)str.charAt(i)] = 1;
			}
			else
				System.out.println(str.charAt(i));
		}
	}
}
