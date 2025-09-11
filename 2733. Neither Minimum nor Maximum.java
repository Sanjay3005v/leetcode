//2733. Neither Minimum nor Maximum


class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        int min=Math.min(nums[0],nums[1]);
        int max=Math.max(nums[0],nums[1]);
        int val=nums[2];
        if(val<max && val>min){
            return val;
        }
        if(val<min){
            return min;
        }
        if(val>max){
            return max;
        }
        return -1;
    }
}
