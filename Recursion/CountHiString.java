public class CountHiString{

	public static void main(String[] args) {
		String str = "gHigklHihi";
		System.out.println(countHiString(str, str.length()-1));
	}

	public static int countHiString(String str, int len){
		if(len <= 0)
			return 0;

		int val = 0;
		if(str.charAt(len) =='i' && str.charAt(len-1) =='H')
			val = 1;

		return val + countHiString(str , len-1);
	}	
}