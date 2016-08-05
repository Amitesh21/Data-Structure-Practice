public class CountXinString{
	
	public static void main(String[] args) {
		String str = "xdfxxerxxc";
		System.out.println(countXinString(str, str.length()-1));
	}

	public static int countXinString(String str , int len){
		if(len < 0)
			return 0;
		int val=0;
		if(str.charAt(len)=='x')
			val =1;

		return val + countXinString(str , len-1);

	}
}