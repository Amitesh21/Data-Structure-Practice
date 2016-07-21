// Reverse digits of an integer.

// Example1: x = 123, return 321
// Example2: x = -123, return -321

public class Solution {
    public int reverse(int x) {
            
        int revInt = 0;
        int check=0;
        if(x<0){
            check=1;
            x= Math.abs(x);
        }
        while(x>0){
            int temp = x % 10;
            revInt =revInt*10 + temp;
            x = x/10;
        }
        
        // if((revInt*10)>Integer.MAX_VALUE || (revInt*10)<Integer.MIN_VALUE) 
        //    return 0;   ---->to check if reversed no overflows integer limit

        if(check==1)
            return -revInt;
        return revInt;
        
    }
}