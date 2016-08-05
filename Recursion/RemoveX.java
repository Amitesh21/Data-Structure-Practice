
public class RemoveX{
	
	public static void main(String[] args) {
		String str = "xsbabxa";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(removeX( sb , sb.length()-1));
		System.out.println(sb);
	}

	public static String removeX(StringBuilder sb , int len){
		if (len < 0)
			return "";

		if (sb.charAt(len) == 'x' )
			sb.replace(len, len+1, "");

		return removeX( sb, len-1);
	}
}