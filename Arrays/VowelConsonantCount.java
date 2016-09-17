// Time Complexity: O(n), space=O(1)

public class VowelConsonantCount{
	public static void main(String[] args) {
		String str = "abc,cdee:WA!";
		int vowelCount = 0;
		int consonantCount = 0;

		for(int i=0 ; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'|| ch=='o'|| ch=='O'|| ch=='u'|| ch=='U'){
				vowelCount++;
			}
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
				consonantCount++;
		}
		System.out.println("vowel: "+vowelCount+" consonant: "+consonantCount);
	}
}