//3191. Minimum Operations to Make Binary Array Elements Equal to One I


class Solution {
    public int minOperations(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                count++;
            }
        }
        for(int i:nums){
            if(i==0){
                return -1;
            }
        }
        return count;
    }
}
