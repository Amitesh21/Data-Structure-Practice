public class ReverseVowel {

    public static void main(String[] args) {
        System.out.println("Reversed String: "+reverseVowels("Hello"));
    }

    public static String reverseVowels(String s) {
        //  using two pinters, one at start and one at end
        int i=0, j=s.length()-1;
        //  check to find when to swap
        int status1=0,status2=0;
        char[] arr = s.toCharArray();
        
        while(i<j){
            
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                status1=1;
            }
            if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' || arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U'){
                status2=1;
            }
            // when both pointer points to vowels, swap
            if(status1==1 && status2==1){
                char swap = arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
                status1=0;
                status2=0;
            }
            //if not a vowel, just increment
            if(status1==0)
                i++;
            if(status2==0)
                j--;
        }
        String str = new String(arr);
        return str;
    }
}