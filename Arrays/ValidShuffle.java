// example, given first = "abc" and second = "def",  third = "dabecf"  
// is a valid shuffle since it preserves the character ordering of the two strings.

// Time Complexity: O(n), space=O(1);
public class ValidShuffle{

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "def";
		String str3 = "adbe";
		System.out.println(validShuffle(str1, str2, str3));
	}

	public static boolean validShuffle(String str1, String str2, String str3) {
		int i=0, j=0;

		if(str3.length()!=(str1.length()+str2.length()))
			return false;

		for(int k=0; k<str3.length(); k++){
			if(i<str1.length() && str3.charAt(k)==str1.charAt(i))
				i++;

			else if(j<str2.length() && str3.charAt(k)==str2.charAt(j))
				j++;

			else
				return false;
		}
		return true;
	}
}