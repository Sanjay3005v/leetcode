//3423. Maximum Difference Between Adjacent Elements in a Circular Array


class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            diff=Math.max(Math.abs(nums[i]-nums[i+1]),diff);
        }
        return diff;
    }
}
