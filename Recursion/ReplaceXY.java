
public class ReplaceXY{
	
	public static void main(String[] args) {
		String str = "xfggxdxc";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(replaceXY( sb , sb.length()-1));
		System.out.println(sb);
	}

	public static String replaceXY(StringBuilder sb , int len){
		if (len < 0)
			return "";

		if (sb.charAt(len) == 'x')
			sb.setCharAt(len, 'y');

		return replaceXY( sb, len-1);
	}
}