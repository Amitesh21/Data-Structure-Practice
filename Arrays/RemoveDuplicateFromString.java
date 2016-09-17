// input: bananas iu w;
// output:bans iuw;

import java.util.*;

public class RemoveDuplicateFromString{

	public static void main(String[] args) {
		String str = "bananas iu w";
		removeDuplicateFromString(str);
	}

	public static void removeDuplicateFromString(String str){
		Set<Character> s = new LinkedHashSet<Character>();

		for(int i=0 ; i<str.length(); i++)
			s.add(str.charAt(i));
		
		for(char ch : s)
			System.out.print(ch);
	}
}