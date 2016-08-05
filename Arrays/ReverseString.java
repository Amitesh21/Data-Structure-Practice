public class  ReverseString{
	
	public static void main(String[] args) {
		String str = "My name is amitesh";
		reverseString(str);
	}

	// 	Reversing string using string builder
	public static void reverseString(String str){
		StringBuilder sb = new StringBuilder(str);
		int i = 0, j = sb.length()-1;
		while(i<j){
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j,temp);
			i++;j--;
		}
		 //System.out.println(sb);
		 String[] splitStr = sb.toString().split(" ");
		 int k=0 ,l=splitStr.length-1;

		 while(k<l){
		 	String temp = splitStr[k];
		 	splitStr[k] = splitStr[l];
		 	splitStr[l] = temp;
		 	k++; l--;
		 }

		 for(String s : splitStr){
		 	System.out.print(s.toString()+" ");
		 }
	}

}