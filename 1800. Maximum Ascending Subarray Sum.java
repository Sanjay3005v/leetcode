//1800. Maximum Ascending Subarray Sum


class Solution {
    public int maxAscendingSum(int[] nums) {
        int sol = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            System.out.println(sol);
            sum = (nums[i] > nums[i - 1]) ? sum + nums[i] : nums[i];
            sol = Math.max(sum, sol);
        }
        return sol;
    }
}
