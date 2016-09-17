public class StringIndexOf{

	public static void main(String[] args) {
		String str1 = "my name is amitesh";
		String str2 = "amitesh";
		System.out.println(stringIndexOf(str1 , str2));
	}

	public static boolean stringIndexOf(String str1, String str2){
		int j=0;
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i)==str2.charAt(j)){
				if(j==str2.length()-1)
					return true;
				j++;
			}
			else{
				j=0;
			}
		}
		return false;
	}	
}