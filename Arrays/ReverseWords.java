// input = "My name is amitesh";
// output= "amitesh is name My";

public class  ReverseWords{
	
	public static void main(String[] args) {
		String str = "My name is amitesh";
		System.out.println(reverseWords(str));
	}

	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		int end = s.length();
		for(int i=s.length()-1 ; i>=0; i--){
			if(s.charAt(i) == ' '){
				sb.append(s.substring(i+1,end)+" ");
				end = i;
			}
		}
		sb.append(s.substring(0,end));
	    return sb.toString().trim();
	}
}