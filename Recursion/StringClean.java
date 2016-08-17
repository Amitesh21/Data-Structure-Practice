// Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. 
// So "yyzzza" yields "yza".

public class StringClean{

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		stringClean(sb , sb.length()-1);
		System.out.println(sb);
	}

	public static String stringClean(StringBuilder sb , int len){
		if(len <= 0)
			return "";

		if(sb.charAt(len) == sb.charAt(len-1))
			sb.replace(len-1 , len , "");

		return stringClean(sb , len-1);
	}
}