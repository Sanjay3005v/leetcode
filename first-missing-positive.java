//41. First Missing Positive
import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
       int j=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        while(nums[i]>=1){
            if(nums[i]!=j+1){
                System.out.println(j);
                break;
            }
            j++;
        }
       }
       return j+1; 
    }
}
