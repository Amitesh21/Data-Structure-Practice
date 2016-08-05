
public class ReplacePIto314{
	
	public static void main(String[] args) {
		String str = "pip";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(replacePIto314( sb , sb.length()-1));
		System.out.println(sb);
	}

	public static String replacePIto314(StringBuilder sb , int len){
		if (len <= 0)
			return "";

		if (sb.charAt(len) == 'i' && sb.charAt(len-1) == 'p' )
			sb.replace(len-1, len+1, "3.14");

		return replacePIto314( sb, len-1);
	}
}