
import java.util.*;

public class AnagramCheck {

    public static void main(String args[]){
        System.out.println(isAnagram("anc a","acn a"));
    }
    public static boolean isAnagram(String s, String t) {
        
        // comparing length
        if(s.length()!=t.length())
            return false;
        
        if(s.equals(t))
            return true;
            
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        
        // putting one string into HashMap to faster check
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        // Checking second string into Map character wise
        for(int j=0; j<t.length(); j++){
            //character is available and its count should be more than 0
            if(hm.get(t.charAt(j))==null || hm.get(t.charAt(j))<=0)
                return false;
            else
                hm.put(t.charAt(j),hm.get(t.charAt(j))-1);
        }
        return true;
    }
}