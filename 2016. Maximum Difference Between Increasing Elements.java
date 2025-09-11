//2016. Maximum Difference Between Increasing Elements


class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int diff = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > diff) {
                max = Math.max(max, nums[i] - diff);
            } else {
                diff = nums[i];
            }
        }
        return max;
    }
}
