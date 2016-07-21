
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

// TimeComplexity = O(n), Space =O(n)
import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        int[] sumIndex = new int[2];
        for(int i=0 ; i<nums.length; i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i])+":"+i);         // to handle input case: ([0,4,3,0] , 0) , both value same
            else                                                // hence to get both index in value field
                hm.put(nums[i],""+i);
        }
        
        for(int j=0; j<nums.length ; j++){
            int toFind = target - nums[j];
            
            if(hm.get(toFind)==null || hm.get(toFind).equals(""+j))     //([3,2,3],6) --> it should give [0,2], not [0,0]
                continue;
            else{
                String str = hm.get(toFind);
                if(str.contains(":")){
                    String[] strIndex = str.split(":");
                    sumIndex[0] = Integer.parseInt(strIndex[0]);
                    sumIndex[1] = Integer.parseInt(strIndex[1]);
                }
                else{
                    sumIndex[0] = j;
                    sumIndex[1] = Integer.parseInt(str);
                }
               break; 
            }
        }
        
        return sumIndex;
    }
}